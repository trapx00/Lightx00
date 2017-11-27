package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.salestaff.SaleBillPo;

public class SaleBillQueryVo extends BaseQueryVo<SaleBillPo, String> {
    /**
     * Instantiate a QueryVo with prepration method.
     *
     * @param preparation QueryBuilderPreparation method
     */
    public SaleBillQueryVo(QueryBuilderPreparation<SaleBillPo, String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public SaleBillQueryVo() {
        super();
    }
}
