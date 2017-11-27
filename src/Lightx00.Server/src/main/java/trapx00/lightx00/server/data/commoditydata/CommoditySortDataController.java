package trapx00.lightx00.server.data.commoditydata;

import com.j256.ormlite.dao.Dao;
import trapx00.lightx00.server.data.commoditydata.factory.CommodityDataDaoFactory;
import trapx00.lightx00.server.data.util.serverlogservice.ServerLogService;
import trapx00.lightx00.server.data.util.serverlogservice.factory.ServerLogServiceFactory;
import trapx00.lightx00.shared.dataservice.commoditydataservice.CommoditySortDataService;
import trapx00.lightx00.shared.exception.database.DbSqlException;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.CommoditySortPo;
import trapx00.lightx00.shared.queryvo.CommoditySortQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;


public class CommoditySortDataController extends UnicastRemoteObject implements CommoditySortDataService {
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
    public CommoditySortDataController() throws RemoteException {

    }

    private Dao<CommoditySortPo, String> commoditySortDao = CommodityDataDaoFactory.getCommoditySortDao();
    private ServerLogService logService = ServerLogServiceFactory.getService();
    private Object delegate = this;

    private void handleSQLException(SQLException e) {
        logService.printLog(delegate, "failed at a database operation. Error message: " + e.getMessage());
        throw new DbSqlException(e);
    }

    /**
     * Create a new commoditySort attaching to a parentSort
     * @param commoditySortPo
     * @param parentSort
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(CommoditySortPo commoditySortPo, CommoditySortPo parentSort) {
        try{
            commoditySortPo.setPreId(parentSort.getId());
            CommoditySortPo po= commoditySortDao.queryForId(commoditySortPo.getId());
            if (po != null) {
                commoditySortDao.update(commoditySortPo);
                logService.printLog(delegate,String.format("updated a CommoditySort %s (id: %s).",commoditySortPo.getName() , commoditySortPo.getId()));
                return ResultMessage.Success;
            }
            commoditySortDao.create(commoditySortPo);
            //commodityPo.setId(commodityDao.extractId(commodityPo));
            logService.printLog(delegate, String.format("created a CommoditySort %s (id: %s).", commoditySortPo.getName() , commoditySortPo.getId()));
            return ResultMessage.Success;
        }catch (SQLException e) {
            handleSQLException(e);
            return ResultMessage.Failure;
        }
    }
    /**
     * Modify a commoditySort
     * @param commoditySort
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(CommoditySortPo commoditySort) {
        try{
            CommoditySortPo po= commoditySortDao.queryForId(commoditySort.getId());
            if (po != null) {
                commoditySortDao.update(commoditySort);
                logService.printLog(delegate,String.format("updated a commoditySort %s (id: %s).",commoditySort.getName() , commoditySort.getId()));
                return ResultMessage.Success;
            }
            commoditySortDao.create(commoditySort);
            //commodityPo.setId(commodityDao.extractId(commodityPo));
            logService.printLog(delegate, String.format("created a commoditySort %s (id: %s).", commoditySort.getName() , commoditySort.getId()));
            return ResultMessage.Success;
        }catch (SQLException e) {
            handleSQLException(e);
            return ResultMessage.Failure;
        }
    }
    /**
     *  Query a commodifySort
     * @param commoditySortQueryVo
     * @return the list of the commoditySort
     */
    @Override
    public CommoditySortPo[] query(CommoditySortQueryVo commoditySortQueryVo) {
        List<CommoditySortPo> result=null;
        try {
            List<CommoditySortPo> results = (List<CommoditySortPo>) commoditySortDao.query(commoditySortQueryVo.prepareQuery(commoditySortDao));
            logService.printLog(delegate, String.format("queried commoditySort and got %d results.", results.size()));
            result=results;
            return result.toArray(new CommoditySortPo[result.size()]);
        } catch (SQLException e) {
            handleSQLException(e);
            return result.toArray(new CommoditySortPo[result.size()]);
        }
    }
    /**
     *  Delete a commoditySort
     * @param commoditySort
     * @return whether the operation is done
     */
    @Override
    public ResultMessage delete(CommoditySortPo commoditySort) {
        try{
            CommoditySortPo po= commoditySortDao.queryForId(commoditySort.getId());
            if (po != null) {
                commoditySortDao.delete(commoditySort);
                logService.printLog(delegate,String.format("deleted a commoditySort %s (id: %s).",commoditySort.getName() , commoditySort.getId()));
                return ResultMessage.Success;
            }
            logService.printLog(delegate, String.format("deleted a commoditySort %s (id: %s),which is not existed", commoditySort.getName() , commoditySort.getId()));
            return ResultMessage.Success;
        }catch (SQLException e) {
            handleSQLException(e);
            return ResultMessage.Failure;
        }
    }
    /**
     * Display all commoditySorts
     * @return the list of commoditySort
     */
    @Override
    public CommoditySortPo[] display() {
        List<CommoditySortPo> result=null;
        try {
            List<CommoditySortPo> results = (List<CommoditySortPo>) commoditySortDao.queryForAll();
            logService.printLog(delegate, String.format("queried commoditySort and got %d results.", results.size()));
            result=results;
            return result.toArray(new CommoditySortPo[result.size()]);
        } catch (SQLException e) {
            handleSQLException(e);
            return result.toArray(new CommoditySortPo[result.size()]);
        }
    }
    /**
     *  Get the childsoft of a commoditySort
     * @param commoditySort
     * @return the childCommoditySort
     */
    @Override
    public CommoditySortPo[] dispaly(CommoditySortPo commoditySort) {
        List<CommoditySortPo> result=null;
        try {
            List<CommoditySortPo> results = (List<CommoditySortPo>) commoditySortDao.queryForAll();
            for(CommoditySortPo commoditySortPo:results){
                if(commoditySortPo.getPreId().equals(commoditySort.getId()))
                    result.add(commoditySortPo);
            }
            logService.printLog(delegate, String.format("queried commoditySort from a commodityParentSort and got %d results.", results.size()));
            return result.toArray(new CommoditySortPo[result.size()]);
        } catch (SQLException e) {
            handleSQLException(e);
            return result.toArray(new CommoditySortPo[result.size()]);
        }
    }


}
