package trapx00.lightx00.client.bl.financebl;

import trapx00.lightx00.shared.vo.financestaff.SystemSnapshotQueryVo;
import trapx00.lightx00.shared.vo.financestaff.SystemSnapshotVo;

public interface SystemSnapshotInfo {
    /**
     * Queries SystemSnapshot.
     * @param query query
     * @return SystemSnapshotVos that match the query
     */
    SystemSnapshotVo[] query(SystemSnapshotQueryVo query);
}
