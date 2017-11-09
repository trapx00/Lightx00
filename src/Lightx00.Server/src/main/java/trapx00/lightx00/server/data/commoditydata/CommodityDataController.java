package trapx00.lightx00.server.data.commoditydata;

import trapx00.lightx00.shared.dataservice.commoditydataservice.CommodityDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.queryvo.CommodityQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CommodityDataController extends UnicastRemoteObject implements CommodityDataService {
    /**
     *
     * @throws RemoteException
     */
    public CommodityDataController() throws RemoteException {
        super();
    }
    /**
     *  Create a new commodity
     * @param newCommodity
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(CommodityPo newCommodity) throws RemoteException {
        return null;
    }
    /**
     *  odiyf a commodity
     * @param updateCommodity
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(CommodityPo updateCommodity)throws RemoteException {
        return null;
    }
    /**
     * uery for a commodity
     * @param commodityQueryVo
     * @return the list of the commodity
     */
    @Override
    public CommodityPo[] query(CommodityQueryVo commodityQueryVo) throws RemoteException{
        return new CommodityPo[0];
    }
    /**
     * Delete a commodity
     * @param commodity
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(CommodityPo commodity)throws RemoteException {
        return null;
    }

    @Override
    public void init() throws RemoteException{

    }
}
