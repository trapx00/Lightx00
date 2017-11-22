package trapx00.lightx00.server.data.financedata;

import com.j256.ormlite.dao.Dao;
import trapx00.lightx00.server.data.financedata.factory.FinanceDataDaoFactory;
import trapx00.lightx00.shared.dataservice.financedataservice.CashBillDataService;
import trapx00.lightx00.shared.exception.database.*;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;
import trapx00.lightx00.shared.queryvo.CashBillQueryVo;
import trapx00.lightx00.shared.util.BillHelper;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;
import java.util.OptionalInt;

public class CashBillDataController extends UnicastRemoteObject implements CashBillDataService {
    /**
     * Creates and exports a new UnicastRemoteObject object using an
     * anonymous port.
     * <p>
     * <p>The object is exported with a server socket
     * created using the {@link RMISocketFactory} class.
     *
     * @throws RemoteException if failed to export object
     * @since JDK1.1
     */
    public CashBillDataController() throws RemoteException {

    }

    private CashBillPo assertIdExistence(String id, boolean assertExists) {
        try {
            CashBillPo cashBillPo = cashBillDao.queryForId(id);
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

    private Dao<CashBillPo, String> cashBillDao = FinanceDataDaoFactory.getCashBillDao();

    /**
     * Submits a CashBill or save it as a draft.
     * If there is a bill with the same id as passed-in parameter do,
     *    if the existing bill is in BillState.Draft state, it will be updated/replaced by parameter.
     *    otherwise a IdExistsException would be thrown.
     *
     * @param bill CashBill
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(CashBillPo bill) {
        try {
            CashBillPo cashBillPo = cashBillDao.queryForId(bill.getId());
            if (cashBillPo != null && cashBillPo.getState().equals(BillState.Draft)) {
                cashBillDao.update(bill);
                return ResultMessage.Success;
            }
            if (cashBillPo != null) {
                throw new IdExistsException(bill.getId());
            }
            cashBillDao.create(bill);
            return ResultMessage.Success;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbSqlException(e);
        }
    }

    /**
     * Activates a CashBill.
     * The bill must be in BillState.WaitingForApproval state.
     * Otherwise a BillInvalidStateException will be thrown.
     *
     * @param id id for the CashBill that have been approved of
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage activate(String id) {
        try {
            CashBillPo cashBillPo = assertIdExistence(id,true);
            if (cashBillPo.getState()== BillState.WaitingForApproval) {
                cashBillPo.setState(BillState.Approved);
                cashBillDao.update(cashBillPo);
                return ResultMessage.Success;
            } else {
                throw new BillInvalidStateException(cashBillPo.getState(), BillState.WaitingForApproval);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbSqlException(e);
        }
    }

    /**
     * Abandons a CashBill.
     * If a Bill is in BillState.Draft, it will be deleted.
     * If a Bill is in BillState.Rejected/Approved/WaitingForApproval, it will be changed as Abandoned.
     * If a bill is in other state, a BillInvalidStateException will be thrown.
     * @param id id for the CashBill to be abandoned
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage abandon(String id) {
        try {
            CashBillPo cashBillPo =  assertIdExistence(id,true);
            switch (cashBillPo.getState()) {
                case Draft:
                    cashBillDao.deleteById(id);
                    return ResultMessage.Success;
                case Rejected:
                case Approved:
                case WaitingForApproval:
                    cashBillPo.setState(BillState.Abandoned);
                    cashBillDao.update(cashBillPo);
                    return ResultMessage.Success;
                default:
                    throw new BillInvalidStateException(cashBillPo.getState(),BillState.Draft, BillState.Rejected, BillState.Approved,BillState.WaitingForApproval);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbSqlException(e);
        }
    }

    /**
     * Queries CashBill.
     *
     * @param query query condition
     * @return CashBillVos that match the query condition
     */
    @Override
    public CashBillPo[] query(CashBillQueryVo query) {
        try {
            List<CashBillPo> cashBillPoList = cashBillDao.query(query.prepareQuery(cashBillDao));
            return cashBillPoList.toArray(new CashBillPo[cashBillPoList.size()]);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbSqlException(e);
        }
    }



    /**
     * Gets the id for the next bill.
     * If there are already 99999 bills for this day, a NoMoreBillException will be thrown.
     *
     * @return id for the next bill
     */
    @Override
    public String getId() {
        try {
            OptionalInt maxId = cashBillDao.queryBuilder().selectColumns("id").query().stream()
                    .map(BillPo::getId)
                    .filter(x->x.split("-")[1].equals(BillHelper.currentDateStringForBill()))
                    .map(x->x.split("-")[2])
                    .mapToInt(Integer::parseInt)
                    .max();
            if (maxId.orElse(-1)==99999) {
                throw new NoMoreBillException();
            }
            return "XJFYD-"+BillHelper.currentDateStringForBill() + "-" + BillHelper.formatId(maxId.orElse(0) +1);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbSqlException(e);
        }
    }
}
