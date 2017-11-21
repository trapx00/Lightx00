package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.manager.promotion.ComSalePromotionPo;

public class ComSalePromotionQueryVo extends BaseQueryVo<ComSalePromotionPo,String> {
    /**
     * Instantiate a QueryVo with prepration method.
     * @param preparation QueryBuilderPreparation method
     */
    public ComSalePromotionQueryVo(QueryBuilderPreparation<ComSalePromotionPo,String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public ComSalePromotionQueryVo() {
        super();
    }
}
