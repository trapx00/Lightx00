package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.salestaff.PurchaseBillPo;

public class PurchaseBillQueryVo extends BaseQueryVo<PurchaseBillPo, String> {
    /**
     * Instantiate a QueryVo with prepration method.
     *
     * @param preparation QueryBuilderPreparation method
     */
    public PurchaseBillQueryVo(QueryBuilderPreparation<PurchaseBillPo, String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public PurchaseBillQueryVo() {
        super();
    }
}
