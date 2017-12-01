package trapx00.lightx00.client.bl.promotionbl;

import trapx00.lightx00.client.bl.draftbl.DraftableQueryService;
import trapx00.lightx00.client.vo.Draftable;
import trapx00.lightx00.client.vo.manager.promotion.PromotionVoBase;
import trapx00.lightx00.client.vo.salestaff.SaleBillVo;

public class PromotionInfoController implements PromotionInfo,DraftableQueryService {
    /**
     * Give usable promotions to the sale.
     * @param saleBill the saleBill which represents current sale activity
     * @return usable promotions to the sale
     */
    @Override
    public PromotionVoBase[] queryPromotion(SaleBillVo saleBill) {
        return new PromotionVoBase[0];
    }

    /**
     * Queries promotion with id.
     * @param id id
     * @return promotionVo
     */
    public PromotionVoBase queryPromotion(String id) { return null;}

    /**
     * Queries draft with id.
     *
     * @param id id
     * @return draft
     */
    @Override
    public Draftable queryDraft(String id) {
        return queryPromotion(id);
    }

}
