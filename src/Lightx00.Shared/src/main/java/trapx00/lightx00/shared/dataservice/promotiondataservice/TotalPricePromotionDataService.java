package trapx00.lightx00.shared.dataservice.promotiondataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.TotalPricePromotionPo;
import trapx00.lightx00.shared.queryvo.Promotion.TotalPricePromotionQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TotalPricePromotionDataService extends Remote {
    /**
     * Submit a completed TotalPricePromotionPo.
     * @param promotion the TotalPricePromotionPo to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(TotalPricePromotionPo promotion) throws RemoteException;

    /**
     * Filter TotalPricePromotionPo.
     * @param query the filter conditions
     * @return array of TotalPricePromotionPo which match the conditions
     */
    TotalPricePromotionPo[] queryPromotion(TotalPricePromotionQueryVo query) throws RemoteException;

    /**
     * Delete a useless TotalPricePromotionPo.
     * @param id id of the TotalPricePromotionPo to be deleted
     * @return whether the operation is done successfully
     */
    ResultMessage delete(String id) throws RemoteException;

    /**
     * Get id for the next promotion.
     *
     * @return id for the next promotion
     */
    String getId() throws RemoteException;
}
