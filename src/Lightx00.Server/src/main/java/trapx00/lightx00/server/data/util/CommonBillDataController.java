package trapx00.lightx00.server.data.util;

import com.j256.ormlite.dao.Dao;
import trapx00.lightx00.shared.exception.database.*;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.queryvo.BaseQueryVo;
import trapx00.lightx00.shared.util.BillHelper;

import java.sql.SQLException;
import java.util.List;
import java.util.OptionalInt;

public class CommonBillDataController<Po extends BillPo> {
    private Dao<Po,String> dao;

    public CommonBillDataController(Dao<Po, String> dao) {
        this.dao = dao;
    }


    /**
     * This function is a util to assert whether the id is used.
     * If assertExists is true but the id is not used, a IdNotExistsException is thrown.
     * If assertExists is false but the id is used, a IdExistsException is thrown.
     * If assertExists is true and the id is used, the bill for the id is returned and no exception is thrown.
     * If assertExists is false and the id is not used, null will be returned and no exception is thrown.
     * @param id id
     * @param assertExists assert exists flag
     * @return BillPo if assertExists is true and the id is used.
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
            e.printStackTrace();
            throw new DbSqlException(e);
        }
    }

    /**
     * Submits a bill or save it as a draft.
     * If there is a bill with the same id as passed-in parameter do,
     *    if the existing bill is in BillState.Draft state, it will be updated/replaced by parameter.
     *    otherwise a IdExistsException would be thrown.
     *
     * @param bill bill
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(Po bill) {
        try {
            Po po = dao.queryForId(bill.getId());
            if (po != null && po.getState().equals(BillState.Draft)) {
                dao.update(bill);
                return ResultMessage.Success;
            }
            if (po != null) {
                throw new IdExistsException(bill.getId());
            }
            dao.create(bill);
            return ResultMessage.Success;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbSqlException(e);
        }
    }

    /**
     * Activates a bill.
     * The bill must be in BillState.WaitingForApproval state.
     * Otherwise a BillInvalidStateException will be thrown.
     *
     * @param id id for the bill that have been approved of
     * @return whether the operation is done successfully
     */
    public ResultMessage activate(String id) {
        try {
            Po po = assertIdExistence(id,true);
            if (po.getState() == BillState.WaitingForApproval) {
                po.setState(BillState.Approved);
                dao.update(po);
                return ResultMessage.Success;
            } else {
                throw new BillInvalidStateException(po.getState(), BillState.WaitingForApproval);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbSqlException(e);
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
    public ResultMessage abandon(String id) {
        try {
            Po po = assertIdExistence(id,true);
            switch (po.getState()) {
                case Draft:
                    dao.deleteById(id);
                    return ResultMessage.Success;
                case Rejected:
                case Approved:
                case WaitingForApproval:
                    po.setState(BillState.Abandoned);
                    dao.update(po);
                    return ResultMessage.Success;
                default:
                    throw new BillInvalidStateException(po.getState(),BillState.Draft, BillState.Rejected, BillState.Approved,BillState.WaitingForApproval);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbSqlException(e);
        }
    }


    /**
     * Queries bills.
     *
     * @param query query condition
     * @return bills that match the query condition
     */
    @SuppressWarnings("unchecked")
    public <Q extends BaseQueryVo> Po[] query(Q query) {
        try {
            List<Po> cashBillPoList = dao.query(query.prepareQuery(dao));
            return (Po[])cashBillPoList.toArray();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbSqlException(e);
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
                .map(BillPo::getId)
                .filter(x -> x.split("-")[1].equals(BillHelper.currentDateStringForBill()))
                .map(x -> x.split("-")[2])
                .mapToInt(Integer::parseInt)
                .max();
            if (maxId.orElse(-1) == 99999) {
                throw new NoMoreBillException();
            }
            return leadingText + "-" + BillHelper.currentDateStringForBill() + "-" + BillHelper.formatId(maxId.orElse(0) + 1);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbSqlException(e);
        }
    }


}
