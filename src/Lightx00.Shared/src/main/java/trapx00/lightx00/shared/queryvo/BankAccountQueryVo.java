package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.financestaff.BankAccountPo;

import java.util.function.Predicate;

public class  BankAccountQueryVo extends BaseQueryVo<BankAccountPo, String>{

    public BankAccountQueryVo(QueryBuilderPreparation<BankAccountPo, String> preparation) {
        super(preparation);
    }
}
