package trapx00.lightx00.client.bl.logbl;

import trapx00.lightx00.client.blservice.logblservice.LogBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.vo.log.LogQueryVo;
import trapx00.lightx00.shared.vo.log.LogVo;

public class LogBlController implements LogBlService, LogService {
    /**
     * Queries logs by LogQueryVo.
     * @param query query
     * @return LogVos that match the query
     */
    @Override
    public LogVo[] query(LogQueryVo query) {
        return new LogVo[0];
    }

    /**
     * Writes log
     * @param severity Log Severity
     * @param content Log content
     * @return Whether operation is done successfully
     */
    @Override
    public ResultMessage log(LogSeverity severity, String content) {
        return null;
    }
}
