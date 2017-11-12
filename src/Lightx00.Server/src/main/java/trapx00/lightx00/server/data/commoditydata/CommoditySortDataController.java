package trapx00.lightx00.server.data.commoditydata;

import trapx00.lightx00.shared.dataservice.commoditydataservice.CommoditySortDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommoditySortPo;
import trapx00.lightx00.shared.queryvo.CommoditySortQueryVo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class CommoditySortDataController extends UnicastRemoteObject implements CommoditySortDataService {
    /**
     *
     * @throws RemoteException
     */
    protected CommoditySortDataController() throws RemoteException {
        super();
    }

    /**
     * Create a new commoditySort attaching to a parentSort
     * @param newCSort
     * @param parentSort
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(CommoditySortPo newCSort, CommoditySortPo parentSort) {
        return null;
    }
    /**
     * Modify a commoditySort
     * @param commoditySort
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(CommoditySortPo commoditySort) {
        return null;
    }
    /**
     *  Query a commodifySort
     * @param commoditySortQueryVo
     * @return the list of the commoditySort
     */
    @Override
    public CommoditySortPo[] query(CommoditySortQueryVo commoditySortQueryVo) {
        return new CommoditySortPo[0];
    }
    /**
     *  Delete a commoditySort
     * @param commoditySort
     * @return whether the operation is done
     */
    @Override
    public ResultMessage delete(CommoditySortPo commoditySort) {
        return null;
    }
    /**
     * Display all commoditySorts
     * @return the list of commoditySort
     */
    @Override
    public CommoditySortPo[] display() {
        return new CommoditySortPo[0];
    }
    /**
     *  Get the childsoft of a commoditySort
     * @param commoditySort
     * @return the childCommoditySort
     */
    @Override
    public CommoditySortPo[] dispaly(CommoditySortPo commoditySort) {
        return new CommoditySortPo[0];
    }

    @Override
    public void init(){

    }
}
