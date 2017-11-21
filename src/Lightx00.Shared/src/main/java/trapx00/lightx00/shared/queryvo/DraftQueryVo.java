package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.DraftPo;

import java.util.function.Predicate;

public class DraftQueryVo extends BaseQueryVo<DraftPo, Integer>{
    public DraftQueryVo(QueryBuilderPreparation<DraftPo, Integer> preparation) {
        super(preparation);
    }
}
