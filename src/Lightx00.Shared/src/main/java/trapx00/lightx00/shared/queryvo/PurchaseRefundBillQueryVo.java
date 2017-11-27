package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.salestaff.PurchaseRefundBillPo;

public class PurchaseRefundBillQueryVo extends BaseQueryVo<PurchaseRefundBillPo, String> {
    /**
     * Instantiate a QueryVo with prepration method.
     *
     * @param preparation QueryBuilderPreparation method
     */
    public PurchaseRefundBillQueryVo(QueryBuilderPreparation<PurchaseRefundBillPo, String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public PurchaseRefundBillQueryVo() {
        super();
    }
}
