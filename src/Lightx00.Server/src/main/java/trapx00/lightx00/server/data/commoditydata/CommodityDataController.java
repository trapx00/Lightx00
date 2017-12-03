package trapx00.lightx00.server.data.commoditydata;

import com.j256.ormlite.dao.Dao;
import trapx00.lightx00.server.data.commoditydata.factory.CommodityDataDaoFactory;
import trapx00.lightx00.server.data.util.serverlogservice.ServerLogService;
import trapx00.lightx00.server.data.util.serverlogservice.factory.ServerLogServiceFactory;
import trapx00.lightx00.shared.dataservice.commoditydataservice.CommodityDataService;
import trapx00.lightx00.shared.exception.database.DbSqlException;
import trapx00.lightx00.shared.exception.database.IdExistsException;
import trapx00.lightx00.shared.exception.database.IdNotExistsException;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.queryvo.CommodityQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CommodityDataController extends UnicastRemoteObject implements CommodityDataService {
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
    public CommodityDataController() throws RemoteException {

    }

    private Dao<CommodityPo, String> commodityDao = CommodityDataDaoFactory.getCommodityDao();
    private ServerLogService logService = ServerLogServiceFactory.getService();
    private Object delegate = this;

    private void handleSQLException(SQLException e) {
        logService.printLog(delegate, "failed at a database operation. Error message: " + e.getMessage());
        throw new DbSqlException(e);
    }
    /**
     *  Create a new commodity
     * @param commodityPo
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(CommodityPo commodityPo)  {
        try{
            CommodityPo po= commodityDao.queryForId(commodityPo.getId());
            if (po != null) {
                commodityDao.update(commodityPo);
                logService.printLog(delegate,String.format("updated a commodity %s (id: %s).",commodityPo.getName() , commodityPo.getId()));
                throw new IdExistsException(commodityPo.getId());
            }
            commodityDao.create(commodityPo);
            //commodityPo.setId(commodityDao.extractId(commodityPo));
            logService.printLog(delegate, String.format("created a %s (id: %s).", commodityPo.getName() , commodityPo.getId()));
            return ResultMessage.Success;
        }catch (SQLException e) {
            handleSQLException(e);
            return ResultMessage.Failure;
        }
    }
    /**
     *  odiyf a commodity
     * @param commodityPo
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(CommodityPo commodityPo) {
        try{
            CommodityPo po= commodityDao.queryForId(commodityPo.getId());
            if (po != null) {
                commodityDao.update(commodityPo);
                logService.printLog(delegate,String.format("updated a commodity %s (id: %s).",commodityPo.getName() , commodityPo.getId()));
                return ResultMessage.Success;
            }
            commodityDao.create(commodityPo);
            //commodityPo.setId(commodityDao.extractId(commodityPo));
            logService.printLog(delegate, String.format("created a %s (id: %s).", commodityPo.getName() , commodityPo.getId()));
            throw new IdNotExistsException(commodityPo.getId());
        }catch (SQLException e) {
            handleSQLException(e);
            return ResultMessage.Failure;
        }
    }
    /**
     * uery for a commodity
     * @param commodityQueryVo
     * @return the list of the commodity
     */
    @Override
    public CommodityPo[] query(CommodityQueryVo commodityQueryVo) {
        List<CommodityPo> result=null;
        try {
            List<CommodityPo> results = (List<CommodityPo>) commodityDao.query(commodityQueryVo.prepareQuery(commodityDao));
            logService.printLog(delegate, String.format("queried commodity and got %d results.", results.size()));
            result=results;
            return result.toArray(new CommodityPo[result.size()]);
        } catch (SQLException e) {
            handleSQLException(e);
            return result.toArray(new CommodityPo[result.size()]);
        }
    }
    /**
     * Delete a commodity
     * @param commodityPo
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(CommodityPo commodityPo) {
        try{
            CommodityPo po= commodityDao.queryForId(commodityPo.getId());
            if (po != null) {
                commodityDao.delete(commodityPo);
                logService.printLog(delegate,String.format("deleted a commodity %s (id: %s).",commodityPo.getName() , commodityPo.getId()));
                return ResultMessage.Success;
            }
            logService.printLog(delegate, String.format("deleted a %s (id: %s),which is not existed", commodityPo.getName() , commodityPo.getId()));
            throw new IdNotExistsException(commodityPo.getId());
        }catch (SQLException e) {
            handleSQLException(e);
            return ResultMessage.Failure;
        }
    }



}
