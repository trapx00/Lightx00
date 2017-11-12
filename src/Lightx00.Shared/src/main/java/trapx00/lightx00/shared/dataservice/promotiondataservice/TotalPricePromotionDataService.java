package trapx00.lightx00.shared.dataservice.promotiondataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.TotalPricePromotionPo;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TotalPricePromotionDataService extends Remote {
    /**
     * submit a completed TotalPricePromotionPo
     * @param promotion the TotalPricePromotionPo to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(TotalPricePromotionPo promotion) throws RemoteException;

    /**
     * filter TotalPricePromotionPo
     * @param query the filter conditions
     * @return array of TotalPricePromotionPo which match the conditions
     */
    TotalPricePromotionPo[] queryPromotion(PromotionQueryVo query) throws RemoteException;

    /**
     * delete a useless TotalPricePromotionPo
     * @param promotion the TotalPricePromotionPo to be deleted
     * @return whether the operation is done successfully
     */
    ResultMessage delete(TotalPricePromotionPo promotion) throws RemoteException;

    /**
     * get id for the next promotion
     *
     * @return id for the next promotion
     */
    String getId() throws RemoteException;
}
