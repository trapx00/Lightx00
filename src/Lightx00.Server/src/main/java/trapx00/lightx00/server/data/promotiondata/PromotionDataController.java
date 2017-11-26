package trapx00.lightx00.server.data.promotiondata;

import com.j256.ormlite.dao.Dao;
import trapx00.lightx00.server.data.util.serverlogservice.ServerLogService;
import trapx00.lightx00.server.data.util.serverlogservice.factory.ServerLogServiceFactory;
import trapx00.lightx00.shared.exception.database.*;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.PromotionPoBase;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.queryvo.BaseQueryVo;
import trapx00.lightx00.shared.util.PromotionHelper;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class PromotionDataController< Po extends PromotionPoBase> {
    private static final int MAX_PROMOTION_NUM_FOR_A_DAY = 99999;
    private Dao<Po,String> dao;
    private Object delegate = this;
    private ServerLogService logService = ServerLogServiceFactory.getService();

    public PromotionDataController(Dao<Po, String> dao) {
        this.dao = dao;
    }

    /**
     * Constructor with delegate. Pass in (this) directly to log with actual caller.
     * @param dao dao
     * @param delegate delegate object. Pass in (this) directly to log with actual caller.
     */
    public PromotionDataController(Dao<Po, String> dao, Object delegate) {
        this.dao = dao;
        this.delegate = delegate;
    }

    private void handleSQLException(SQLException e) {
        logService.printLog(delegate, "failed at a database operation. Error message: " + e.getMessage());
        throw new DbSqlException(e);
    }

    /**
     * This function is a util to assert whether the id is used.
     * If assertExists is true but the id is not used, a IdNotExistsException is thrown.
     * If assertExists is false but the id is used, a IdExistsException is thrown.
     * If assertExists is true and the id is used, the bill for the id is returned and no exception is thrown.
     * If assertExists is false and the id is not used, null will be returned and no exception is thrown.
     * @param id id
     * @param assertExists assert exists flag
     * @return PromotionPoBase if assertExists is true and the id is used.
     */
    public Po assertIdExistence(String id, boolean assertExists) {
        try {
            Po cashBillPo = dao.queryForId(id);
            boolean actualExistence = cashBillPo != null;
            if (actualExistence && !assertExists) {
                throw new IdExistsException(id);
            }
            if (!actualExistence && assertExists) {
                throw new IdNotExistsException(id);
            }
            return cashBillPo;
        } catch (SQLException e) {
            handleSQLException(e);
            return null;
        }
    }

    /**
     * Submits a promotion or save it as a draft.
     * If there is a promotion with the same id as passed-in parameter do,
     *    if the existing promotion is in PromotionPoBase.Draft state, it will be updated/replaced by parameter.
     *    otherwise a IdExistsException would be thrown.
     *
     * @param promotion promotion
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(Po promotion) {
        try {
            Po po = dao.queryForId(promotion.getId());
            if (po != null && po.getState().equals(PromotionState.Draft)) {
                dao.update(promotion);
                logService.printLog(delegate,String.format("updated a draft %s (id: %s). New content: %s", promotion.getState().toString(), promotion.getId(), promotion.toString()));
                return ResultMessage.Success;
            }
            if (po != null) {
                throw new IdExistsException(promotion.getId());
            }
            dao.create(promotion);
            promotion.setId(dao.extractId(promotion));
            logService.printLog(delegate, String.format("created a %s (id: %s). Content: %s", promotion.getPromotionType().toString(), promotion.getId(), promotion.toString()));
            return ResultMessage.Success;
        } catch (SQLException e) {
            handleSQLException(e);
            return ResultMessage.Failure;
        }
    }

    /**
     * Abandons a bill.
     * If a Bill is in BillState.Draft, it will be deleted.
     * If a Bill is in BillState.Rejected/Approved/WaitingForApproval, it will be changed as Abandoned.
     * If a bill is in other state, a BillInvalidStateException will be thrown.
     * @param id id for the CashBill to be abandoned
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(String id) {
        try {
            Po po = assertIdExistence(id,true);
            switch (po.getState()) {
                case Draft:
                    dao.deleteById(id);
                    logService.printLog(delegate, String.format("deletes a draft %s (id: %s)", po.getPromotionType(), id));
                    return ResultMessage.Success;
                case Overdue:
                    dao.deleteById(id);
                    logService.printLog(delegate, String.format("deletes an overdue %s (id: %s)", po.getPromotionType(), id));
                    return ResultMessage.Success;
                case Active:
                case Waiting:
                    PromotionState previousState = po.getState();
                    po.setState(PromotionState.Abandoned);
                    dao.update(po);
                    logService.printLog(delegate, String.format("marked a %s (id: %s) as Abandoned (previously %s)", po.getPromotionType(), po.getId(), previousState));
                    return ResultMessage.Success;
                default:
                    throw new PromotionInvalidStateException(po.getState(),PromotionState.Draft, PromotionState.Overdue, PromotionState.Active,PromotionState.Waiting);
            }
        } catch (SQLException e) {
            handleSQLException(e);
            return ResultMessage.Failure;
        }
    }


    /**
     * Queries promotions.
     *
     * @param query query condition
     * @return promotions that match the query condition
     */
    @SuppressWarnings("unchecked")
    public <Q extends BaseQueryVo> List<Po> query(Q query) {
        try {
            List<Po> results = (List<Po>) dao.query(query.prepareQuery(dao));
            logService.printLog(delegate, String.format("queried promotions and got %d results.", results.size()));
            return results;
        } catch (SQLException e) {
            handleSQLException(e);
            return new ArrayList<>();
        }
    }

    /**
     * Gets the id for the next bill.
     * If there are already 99999 bills for this day, a NoMoreBillException will be thrown.
     *
     * @param leadingText leading text for the bill. For instance 现金费用单's leading text is XJFYD. It can be found in the doc
     * @return id for the next bill
     */
    public String getId(String leadingText) {
        try {
            OptionalInt maxId = dao.queryBuilder().selectColumns("id").query().stream()
                    .map(PromotionPoBase::getId)
                    .filter(x -> x.split("-")[1].equals(PromotionHelper.currentDateStringForPromotion()))
                    .map(x -> x.split("-")[2])
                    .mapToInt(Integer::parseInt)
                    .max();
            if (maxId.orElse(-1) == MAX_PROMOTION_NUM_FOR_A_DAY) {
                logService.printLog(delegate, "got a new id and it has been full.");
                throw new NoMoreBillException();
            }
            String newId = leadingText + "-" + PromotionHelper.currentDateStringForPromotion() + "-" + PromotionHelper.formatId(maxId.orElse(0) + 1);
            logService.printLog(delegate, "got a new id " + newId);
            return newId;
        } catch (SQLException e) {
            handleSQLException(e);
            return "";
        }
    }

}
