package trapx00.lightx00.client.blservice.promotionblservice;

import trapx00.lightx00.client.vo.manager.promotion.TotalPricePromotionVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

import java.rmi.RemoteException;

public interface TotalPricePromotionBlService {
    /**
     * submit a TotalPricePromotionVo
     * @param promotion the TotalPricePromotionVo to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(TotalPricePromotionVo promotion);

    /**
     * save a half-completed TotalPricePromotionVo as a draft
     * @param promotion the TotalPricePromotionVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    ResultMessage saveAsDraft(TotalPricePromotionVo promotion);

    /**
     * filter TotalPricePromotionVo
     * @param query the filter conditions
     * @return array of TotalPricePromotionVo which match the conditions
     */
    TotalPricePromotionVo[] queryPromotion(PromotionQueryVo query);

    /**
     * delete a overdue or needless TotalPricePromotionVo
     * @param promotion the TotalPricePromotionVo to be deleted
     * @return whether the operation is done successfully
     */
    ResultMessage delete(TotalPricePromotionVo promotion);

    /**
     * get id for the next promotion
     * @return id for the next promotion
     */
    String getId();
}