package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.manager.BillInfoPo;

public class BillInfoQueryVo extends BaseQueryVo<BillInfoPo,String> {
    /**
     * Instantiate a QueryVo with prepration method.
     * @param preparation QueryBuilderPreparation method
     */
    public BillInfoQueryVo(QueryBuilderPreparation<BillInfoPo,String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public BillInfoQueryVo() {
        super();
    }
}
