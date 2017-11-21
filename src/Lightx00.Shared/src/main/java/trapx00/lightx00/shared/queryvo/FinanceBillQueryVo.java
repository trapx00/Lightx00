package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.financestaff.FinanceBillPo;

import java.util.function.Predicate;

public class FinanceBillQueryVo extends BaseQueryVo<FinanceBillPo, String> {
    public FinanceBillQueryVo(QueryBuilderPreparation<FinanceBillPo, String> preparation) {
        super(preparation);
    }
}
