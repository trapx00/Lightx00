package trapx00.lightx00.server.data.inventorydata;

import com.j256.ormlite.dao.Dao;
import trapx00.lightx00.server.data.inventorydata.factory.InventoryDataDaoFactory;
import trapx00.lightx00.server.data.util.CommonBillDataController;
import trapx00.lightx00.server.data.util.serverlogservice.ServerLogService;
import trapx00.lightx00.server.data.util.serverlogservice.factory.ServerLogServiceFactory;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryCheckDataService;
import trapx00.lightx00.shared.exception.database.DbSqlException;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.InventoryPicturePo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryViewPo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.Date;

public class InventoryCheckDataController extends UnicastRemoteObject implements InventoryCheckDataService {  /**
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
    public InventoryCheckDataController() throws RemoteException {

    }

    private Dao<InventoryViewPo, String> invnetoryViewDao = InventoryDataDaoFactory.getInventoryViewDao();
    private Dao<InventoryPicturePo, String> inventoryPictureDao = InventoryDataDaoFactory.getInventoryPictureDao();
    private Object delegate = this;
    private ServerLogService logService = ServerLogServiceFactory.getService();


    private void handleSQLException(SQLException e) {
        logService.printLog(delegate, "failed at a database operation. Error message: " + e.getMessage());
        throw new DbSqlException(e);
    }

    /**
     * Checks the invenntory change between the begintime and endtime
     * @param beginTime
     * @param endTime
     * @return The inventoryView during specified time range
     */
    @Override
    public InventoryViewPo submit(Date beginTime, Date endTime) {

       return  null;
    }
    /**
     * Gets the inventory snapshot
     * @return The inventory snapshot during that day
     */
    @Override
    public InventoryPicturePo submit(Date time) {
        return null;
    }


}
