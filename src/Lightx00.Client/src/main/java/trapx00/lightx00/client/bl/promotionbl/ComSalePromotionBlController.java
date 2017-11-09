package trapx00.lightx00.client.bl.promotionbl;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.blservice.promotionblservice.ComSalePromotionBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.manager.promotion.ComSalePromotionVo;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

public class ComSalePromotionBlController implements ComSalePromotionBlService, DraftDeleteService {

    /**
     * submit a ComSalePromotionVo
     * @param promotion the ComSalePromotionVo to be submitted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage submit(ComSalePromotionVo promotion) {
        return null;
    }

    /**
     * save a half-completed ComSalePromotionVo as a draft
     * @param promotion the ComSalePromotionVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage saveAsDraft(ComSalePromotionVo promotion) {
        return null;
    }

    /**
     * delete a overdue or needless ComSalePromotionVo
     * @param promotion the ComSalePromotionVo to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(ComSalePromotionVo promotion) {
        return null;
    }

    /**
     * filter some CommodityOnSaleVos
     * @param query the filter conditions
     * @return array of CommodityOnSaleVos which match the conditions
     */
    @Override
    public ComSalePromotionVo[] queryPromotion(PromotionQueryVo query) {
        return new ComSalePromotionVo[0];
    }

    /**
     * get id for the next ComSalePromotionVo
     * @return id for the next ComSalePromotionVo
     */
    @Override
    public String getId() {
        return null;
    }

    /**
     * delete a draft
     * @param id id of the draft to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage deleteDraft(String id) {
        return null;
    }

}
