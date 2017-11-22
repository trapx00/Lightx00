package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.financestaff.SystemSnapshotPo;

import java.util.function.Predicate;

public class SystemSnapshotQueryVo extends BaseQueryVo<SystemSnapshotPo, String> {
    /**
     * Instantiate a QueryVo with prepration method.
     *
     * @param preparation QueryBuilderPreparation method
     */
    public SystemSnapshotQueryVo(QueryBuilderPreparation<SystemSnapshotPo, String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public SystemSnapshotQueryVo() {
        super();
    }
}
