package trapx00.lightx00.shared.dataservice.promotiondataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.ComSalePromotionPo;
import trapx00.lightx00.shared.queryvo.ComSalePromotionQueryVo;

import java.rmi.Remote;

public interface ComSalePromotionDataService extends Remote {
    /**
     * Submit a completed ComSalePromotionPo.
     * @param promotion the ComSalePromotionPo to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(ComSalePromotionPo promotion);

    /**
     * Filter ComSalePromotionPo.
     * @param query the filter conditions
     * @return array of ComSalePromotionPo which match the conditions
     */
    ComSalePromotionPo[] queryPromotion(ComSalePromotionQueryVo query);

    /**
     * Delete a useless ComSalePromotionPo.
     * @param promotion the ComSalePromotionPo to be deleted
     * @return whether the operation is done successfully
     */
    ResultMessage delete(ComSalePromotionPo promotion);

    /**
     * Get id for the next promotion.
     *
     * @return id for the next promotion
     */
    String getId();
}
