package trapx00.lightx00.server.data.logdata.mock;

import trapx00.lightx00.server.data.logdata.LogDataController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.vo.log.LogQueryVo;
import trapx00.lightx00.shared.vo.log.LogVo;

public class LogDataControllerMock extends LogDataController {
    /**
     * Writes log.
     *
     * @param severity Log severity
     * @param content  content
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage log(LogSeverity severity, String content) {
        return super.log(severity, content);
    }

    /**
     * Queries log.
     *
     * @param query query
     * @return LogVos that match query condition
     */
    @Override
    public LogVo[] query(LogQueryVo query) {
        return super.query(query);
    }
}
