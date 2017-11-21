package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.manager.promotion.TotalPricePromotionPo;

public class TotalPricePromotionQueryVo extends  BaseQueryVo<TotalPricePromotionPo,String> {
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
