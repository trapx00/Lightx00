package trapx00.lightx00.server.data.inventorydata;

import com.j256.ormlite.dao.Dao;
import trapx00.lightx00.server.data.inventorydata.factory.InventoryDataDaoFactory;
import trapx00.lightx00.server.data.inventorydata.factory.InventoryOtherDataDaoFactory;
import trapx00.lightx00.server.data.util.CommonBillDataController;
import trapx00.lightx00.server.data.util.serverlogservice.ServerLogService;
import trapx00.lightx00.server.data.util.serverlogservice.factory.ServerLogServiceFactory;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryCheckDataService;
import trapx00.lightx00.shared.exception.database.DbSqlException;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.InventoryPicturePo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryViewPo;
import trapx00.lightx00.shared.queryvo.InventoryPictureQueryVo;
import trapx00.lightx00.shared.queryvo.InventoryViewQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

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

    private Dao<InventoryViewPo, String> invnetoryViewDao = InventoryOtherDataDaoFactory.getInventoryViewDao();
    private Dao<InventoryPicturePo, String> inventoryPictureDao = InventoryOtherDataDaoFactory.getInventoryPictureDao();
    private Object delegate = this;
    private ServerLogService logService = ServerLogServiceFactory.getService();


    private void handleSQLException(SQLException e) {
        logService.printLog(delegate, "failed at a database operation. Error message: " + e.getMessage());
        throw new DbSqlException(e);
    }

    /**
     * Checks the invenntory change between the begintime and endtime
     * @param inventoryViewQueryVo
     * @return The inventoryView during specified time range
     */
    @Override
    public InventoryViewPo[] getInventoryView(InventoryViewQueryVo inventoryViewQueryVo) {

        List<InventoryViewPo> result=null;
        try {
            List<InventoryViewPo> results = (List<InventoryViewPo>) invnetoryViewDao.query(inventoryViewQueryVo.prepareQuery(invnetoryViewDao));
            logService.printLog(delegate, String.format("queried inventoryView and got %d results.", results.size()));
            result=results;
            return result.toArray(new InventoryViewPo[result.size()]);
        } catch (SQLException e) {
            handleSQLException(e);
            return result.toArray(new InventoryViewPo[result.size()]);
        }
    }
    /**
     * Gets the inventory snapshot
     * @return The inventory snapshot during that day
     */


}
