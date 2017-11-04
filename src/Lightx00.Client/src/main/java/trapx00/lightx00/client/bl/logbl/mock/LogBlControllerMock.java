package trapx00.lightx00.client.bl.logbl.mock;

import trapx00.lightx00.client.bl.logbl.LogBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.vo.log.LogQueryVo;
import trapx00.lightx00.shared.vo.log.LogVo;

public class LogBlControllerMock extends LogBlController {
    /**
     * Writes log.
     *
     * @param severity Log Severity
     * @param content  Log content
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage log(LogSeverity severity, String content) {
        return super.log(severity, content);
    }

    /**
     * Queries Log with LogQueryVo.
     *
     * @param query query
     * @return LogVos that match query
     */
    @Override
    public LogVo[] query(LogQueryVo query) {
        return super.query(query);
    }
}
