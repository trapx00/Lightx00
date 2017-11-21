package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.manager.promotion.ClientPromotionPo;

public class ClientPromotionQueryVo extends BaseQueryVo<ClientPromotionPo,String> {
    /**
     * Instantiate a QueryVo with prepration method.
     * @param preparation QueryBuilderPreparation method
     */
    public ClientPromotionQueryVo(QueryBuilderPreparation<ClientPromotionPo,String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public ClientPromotionQueryVo() {
        super();
    }
}
