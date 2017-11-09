package trapx00.lightx00.shared.dataservice.commoditydataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.queryvo.CommodityQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface CommodityDataService extends Remote {

    /**
     *  Create a new commodity
     * @param newCommodity
     * @return whether the operation is done successfully
     */
    ResultMessage add(CommodityPo newCommodity) throws RemoteException;//新建商品

    /**
     *  odiyf a commodity
     * @param updateCommodity
     * @return whether the operation is done successfully
     */
    ResultMessage modify(CommodityPo updateCommodity)throws RemoteException;//修改

    /**
     * uery for a commodity
     * @param commodityQueryVo
     * @return the list of the commodity
     */
    CommodityPo[] query(CommodityQueryVo commodityQueryVo)throws RemoteException;//查询

    /**
     * Delete a commodity
     * @param commodity
     * @return whether the operation is done successfully
     */
    ResultMessage delete(CommodityPo commodity)throws RemoteException;//删除

    void init() throws RemoteException;//初始化

}
