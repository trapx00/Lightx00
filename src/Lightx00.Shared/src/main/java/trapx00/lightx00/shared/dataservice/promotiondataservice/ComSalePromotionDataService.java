package trapx00.lightx00.shared.dataservice.promotiondataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.ComSalePromotionPo;
import trapx00.lightx00.shared.queryvo.promotion.ComSalePromotionQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ComSalePromotionDataService extends Remote {
    /**
     * Submit a completed ComSalePromotionPo.
     * @param promotion the ComSalePromotionPo to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(ComSalePromotionPo promotion)throws RemoteException;

    /**
     * Filter ComSalePromotionPo.
     * @param query the filter conditions
     * @return array of ComSalePromotionPo which match the conditions
     */
    ComSalePromotionPo[] queryPromotion(ComSalePromotionQueryVo query)throws RemoteException;

    /**
     * Delete a useless ComSalePromotionPo.
     * @param id id of the ComSalePromotionPo to be deleted
     * @return whether the operation is done successfully
     */
    ResultMessage delete(String id)throws RemoteException;

    /**
     * Get id for the next promotion.
     *
     * @return id for the next promotion
     */
    String getId()throws RemoteException;
}
