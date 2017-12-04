package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.financestaff.ReceivalBillPo;

import java.util.function.Predicate;

public class ReceivalBillQueryVo extends SpecificFinanceBillQueryVo<ReceivalBillPo, ReceivalBillQueryVo> {
    public ReceivalBillQueryVo() {
    }

    public ReceivalBillQueryVo(BaseQueryVo another) {
        super(another);
    }
}
