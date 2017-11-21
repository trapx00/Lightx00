package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.financestaff.PaymentBillPo;

import java.util.function.Predicate;

public class PaymentBillQueryVo extends BaseQueryVo<PaymentBillPo,String> {
    /**
     * Instantiate a QueryVo with prepration method.
     *
     * @param preparation QueryBuilderPreparation method
     */
    public PaymentBillQueryVo(QueryBuilderPreparation<PaymentBillPo, String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public PaymentBillQueryVo() {
        super();
    }
}
