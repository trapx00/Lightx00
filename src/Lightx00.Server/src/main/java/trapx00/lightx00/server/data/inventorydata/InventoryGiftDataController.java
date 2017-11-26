package trapx00.lightx00.server.data.inventorydata;

import com.j256.ormlite.dao.Dao;
import trapx00.lightx00.server.data.inventorydata.factory.InventoryDataDaoFactory;
import trapx00.lightx00.server.data.util.serverlogservice.ServerLogService;
import trapx00.lightx00.server.data.util.serverlogservice.factory.ServerLogServiceFactory;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryGiftDataService;
import trapx00.lightx00.shared.exception.database.DbSqlException;
import trapx00.lightx00.shared.exception.database.IdExistsException;
import trapx00.lightx00.shared.exception.database.IdNotExistsException;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.inventorystaff.InventoryGiftPo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.Date;

public class InventoryGiftDataController extends UnicastRemoteObject implements InventoryGiftDataService {
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
    public InventoryGiftDataController() throws RemoteException {
    }

    private Dao<InventoryGiftPo, String> inventoryGiftDao = InventoryDataDaoFactory.getInventoryGiftDao();
    private Object delegate = this;
    private ServerLogService logService = ServerLogServiceFactory.getService();

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
     * @return BillPo if assertExists is true and the id is used.
     */
    public InventoryGiftPo assertIdExistence(String id, boolean assertExists) {
        try {
            InventoryGiftPo inventoryGiftPo = inventoryGiftDao.queryForId(id);
            boolean actualExistence = inventoryGiftPo != null;
            if (actualExistence && !assertExists) {
                throw new IdExistsException(id);
            }
            if (!actualExistence && assertExists) {
                throw new IdNotExistsException(id);
            }
            return inventoryGiftPo;
        } catch (SQLException e) {
            handleSQLException(e);
            return null;
        }
    }

    /**
     * Gets the giftBill during specified time range
     * @param time
     * @return The bill during specified time range
     */
    @Override
    public InventoryGiftPo getGift(Date time) {
        return null;
    }
    /**
     * Gets the id for the next bill.
     * @return id for the next bill
     */
    @Override
    public String getId() {
        return null;
    }

    @Override
    public ResultMessage approvalComplete(String billId, BillState billState) throws RemoteException {
        return null;
    }


}
