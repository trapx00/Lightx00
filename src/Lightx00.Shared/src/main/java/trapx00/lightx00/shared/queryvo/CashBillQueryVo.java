package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.financestaff.CashBillPo;

import java.util.function.Predicate;

public class CashBillQueryVo extends BaseQueryVo<CashBillPo,String> {

    /**
     * Instantiate a QueryVo with prepration method.
     *
     * @param preparation QueryBuilderPreparation method
     */
    public CashBillQueryVo(QueryBuilderPreparation<CashBillPo, String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public CashBillQueryVo() {
        super();
    }
}
