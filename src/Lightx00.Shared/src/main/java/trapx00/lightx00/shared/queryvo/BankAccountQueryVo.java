package trapx00.lightx00.shared.queryvo;

import com.j256.ormlite.stmt.QueryBuilder;
import trapx00.lightx00.shared.po.financestaff.BankAccountPo;

import java.util.function.Predicate;

public class  BankAccountQueryVo extends BaseQueryVo<BankAccountPo, Integer>{

    /**
     * Instantiate a QueryVo with prepration method.
     *
     * @param preparation QueryBuilderPreparation method
     */
    public BankAccountQueryVo(QueryBuilderPreparation<BankAccountPo, Integer> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public BankAccountQueryVo() {
        super();
    }
}
