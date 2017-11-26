package trapx00.lightx00.server.data.approvaldata;

import com.j256.ormlite.dao.Dao;
import trapx00.lightx00.server.data.approvaldata.factory.AuditDataDaoFactory;
import trapx00.lightx00.server.data.util.serverlogservice.ServerLogService;
import trapx00.lightx00.server.data.util.serverlogservice.factory.ServerLogServiceFactory;
import trapx00.lightx00.shared.dataservice.approvaldataservice.AuditDataService;
import trapx00.lightx00.shared.exception.database.DbSqlException;
import trapx00.lightx00.shared.exception.database.IdExistsException;
import trapx00.lightx00.shared.exception.database.IdNotExistsException;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.admin.BillInfoPo;
import trapx00.lightx00.shared.po.bill.BillPo;
import trapx00.lightx00.shared.queryvo.BillInfoQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class AuditDataController extends UnicastRemoteObject implements AuditDataService {
    /**
     * Creates and exports a new UnicastRemoteObject object using an
     * anonymous port.
     *
     * <p>The object is exported with a server socket
     * created using the {@link RMISocketFactory} class.
     *
     * @throws RemoteException if failed to export object
     * @since JDK1.1
     */
    public AuditDataController() throws RemoteException {
    }

    private Dao<BillInfoPo, String> dao = AuditDataDaoFactory.getAuditDao();
    private ServerLogService serverLogService = ServerLogServiceFactory.getService();

    /**
     * Filter some BillInfoPo.
     * @param query the filter conditions
     * @return array of BillInfoPo which match the conditions
     */
    public BillInfoPo[] query(BillInfoQueryVo query) {
        try {
            List<BillInfoPo> results = dao.query(query.prepareQuery(dao));
            serverLogService.printLog(this,String.format("queried BillInfoPos and got %d results", results.size()));
            return results.toArray(new BillInfoPo[results.size()]);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbSqlException(e);
        }
    }

    /**
     * Delete BillInfoPo after approving the bill.
     * @param billInfo the corresponding BillInfoPo to the BillPo
     * @return whether the operation is done successfully
     */
    public ResultMessage pass(BillInfoPo billInfo) {
        assertExists(billInfo.getId(), true);
        try {
            dao.deleteById(billInfo.getId());
            serverLogService.printLog(this, String.format("approved BillPo (id: %s)",billInfo.getId()));
            return ResultMessage.Success;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbSqlException(e);
        }
    }

    /**
     * Delete BillInfoPo after rejecting the approval.
     * @param billInfo the corresponding BillInfoPo to the BillPo
     * @return whether the operation is done successfully
     */
    public ResultMessage reject(BillInfoPo billInfo) {
        assertExists(billInfo.getId(), true);
        try {
            dao.deleteById(billInfo.getId());
            serverLogService.printLog(this, String.format("rejected to approve BillPo (id: %s)",billInfo.getId()));
            return ResultMessage.Success;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbSqlException(e);
        }
    }

    /**
     * Save the submitted BillPo as BillInfoPo.
     * @param bill the bill has been submitted
     * @return whether the operation is done successfully
     */
    //在BillInfoPo表里增加一条记录
    @Override
    public ResultMessage requestApproval(BillPo bill) {
        assertExists(bill.getId(), false);
        try {
            BillInfoPo billInfo = new BillInfoPo(bill.getId(),bill.getBillType(),new Date(),bill.getState());
            dao.create(billInfo);
            serverLogService.printLog(this, String.format("submit Bill (id: %s)",bill.getId()));
            return ResultMessage.Success;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbSqlException(e);
        }
    }

    private void assertExists(String id, boolean expectedExists) {
        try {
            BillInfoPo billInfo = dao.queryForId(id);
            boolean actualExists = billInfo != null;
            if (actualExists && !expectedExists) {
                throw new IdExistsException(String.valueOf(id));
            } else if (!actualExists && expectedExists) {
                throw new IdNotExistsException(String.valueOf(id));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbSqlException(e);
        }
    }
}
