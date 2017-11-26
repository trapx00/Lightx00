package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.salestaff.SaleRefundBillPo;

public class SaleRefundBillQueryVo extends BaseQueryVo<SaleRefundBillPo, String> {
    /**
     * Instantiate a QueryVo with prepration method.
     *
     * @param preparation QueryBuilderPreparation method
     */
    public SaleRefundBillQueryVo(QueryBuilderPreparation<SaleRefundBillPo, String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public SaleRefundBillQueryVo() {
        super();
    }
}
