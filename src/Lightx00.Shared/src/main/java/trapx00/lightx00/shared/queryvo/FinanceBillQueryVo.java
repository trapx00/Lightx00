package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.financestaff.FinanceBillPo;

import java.util.function.Predicate;

public class FinanceBillQueryVo extends BaseQueryVo<FinanceBillPo, String> {
    /**
     * Instantiate a QueryVo with prepration method.
     *
     * @param preparation QueryBuilderPreparation method
     */
    public FinanceBillQueryVo(QueryBuilderPreparation<FinanceBillPo, String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public FinanceBillQueryVo() {
        super();
    }
}
