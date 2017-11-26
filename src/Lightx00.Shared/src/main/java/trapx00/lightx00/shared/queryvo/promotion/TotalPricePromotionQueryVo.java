package trapx00.lightx00.shared.queryvo.promotion;

import trapx00.lightx00.shared.po.manager.promotion.TotalPricePromotionPo;
import trapx00.lightx00.shared.queryvo.BaseQueryVo;
import trapx00.lightx00.shared.queryvo.QueryBuilderPreparation;

public class TotalPricePromotionQueryVo extends BaseQueryVo<TotalPricePromotionPo,String> {
    /**
     * Instantiate a QueryVo with prepration method.
     * @param preparation QueryBuilderPreparation method
     */
    public TotalPricePromotionQueryVo(QueryBuilderPreparation<TotalPricePromotionPo,String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public TotalPricePromotionQueryVo() {
        super();
    }
}
