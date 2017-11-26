package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.draft.DraftPo;

public class DraftQueryVo extends BaseQueryVo<DraftPo, Integer>{
    /**
     * Instantiate a QueryVo with prepration method.
     *
     * @param preparation QueryBuilderPreparation method
     */
    public DraftQueryVo(QueryBuilderPreparation<DraftPo, Integer> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public DraftQueryVo() {
        super();
    }
}
