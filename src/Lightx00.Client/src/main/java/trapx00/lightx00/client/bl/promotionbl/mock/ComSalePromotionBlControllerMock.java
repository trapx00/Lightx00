package trapx00.lightx00.client.bl.promotionbl.mock;

import trapx00.lightx00.client.bl.promotionbl.ComSalePromotionBlController;
import trapx00.lightx00.client.vo.manager.promotion.ComSalePromotionVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.manager.promotion.PromotionCommodity;
import trapx00.lightx00.shared.po.manager.promotion.PromotionState;
import trapx00.lightx00.shared.queryvo.PromotionQueryVo;

import java.util.Date;

public class ComSalePromotionBlControllerMock extends ComSalePromotionBlController {
    /**
     * submit a ComSalePromotionVo
     * @param newPromotion the ComSalePromotionVo to be submitted
     * @return whether the operation is done successfully
     */
    public ResultMessage submit(ComSalePromotionVo newPromotion) {
        return ResultMessage.Success;
    }

    /**
     * save a half-completed ComSalePromotionVo as a draft
     * @param promotion the ComSalePromotionVo to be saved as a draft
     * @return whether the operation is done successfully
     */
    public ResultMessage saveAsDraft(ComSalePromotionVo promotion) {
        return ResultMessage.Success;
    }

    /**
     * filter ComSalePromotionVo
     * @param query the filter conditions
     * @return array of ComSalePromotionVo which match the conditions
     */
    public ComSalePromotionVo[] queryPromotion(PromotionQueryVo query) {
        return new ComSalePromotionVo[]{
                new ComSalePromotionVo("0001",new Date(),new Date(), PromotionState.Waiting,new PromotionCommodity[0],200)
        };
    }

    /**
     * delete a overdue or needless ComSalePromotionVo
     * @param promotion the ComSalePromotionVo to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(ComSalePromotionVo promotion) {
        return ResultMessage.Success;
    }

    /**
     * get id for the next ComSalePromotionVo
     * @return id for the next ComSalePromotionVo
     */
    public String getId() {
        return super.getId();
    }

}
