package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.bill.BillPo;

public class BillQueryVo extends BaseQueryVo<BillPo,String> {
    /**
     * Instantiate a QueryVo with prepration method.
     * @param preparation QueryBuilderPreparation method
     */
    public BillQueryVo(QueryBuilderPreparation<BillPo,String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public BillQueryVo() {
        super();
    }
}
