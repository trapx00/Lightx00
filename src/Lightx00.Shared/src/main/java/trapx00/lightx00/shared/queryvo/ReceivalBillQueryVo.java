package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.financestaff.ReceivalBillPo;

import java.util.function.Predicate;

public class ReceivalBillQueryVo extends BaseQueryVo<ReceivalBillPo, String> {
    /**
     * Instantiate a QueryVo with prepration method.
     *
     * @param preparation QueryBuilderPreparation method
     */
    public ReceivalBillQueryVo(QueryBuilderPreparation<ReceivalBillPo, String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public ReceivalBillQueryVo() {
        super();
    }
}
