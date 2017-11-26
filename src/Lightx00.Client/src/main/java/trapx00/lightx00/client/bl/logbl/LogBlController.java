package trapx00.lightx00.client.bl.logbl;

import trapx00.lightx00.client.blservice.logblservice.LogBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.queryvo.LogQueryVo;
import trapx00.lightx00.client.vo.log.LogVo;

import java.net.URI;

public class LogBlController implements LogBlService, LogService {
    /**
     * Writes log.
     *
     * @param severity Log Severity
     * @param content  Log content
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage log(LogSeverity severity, String content) {
        return null;
    }

    /**
     * back up the log information on the server to oos and clear the log
     *
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage backupLog() {
        return null;
    }

    /**
     * get the log backed up on the cloud
     *
     * @return the temp uri of the log resources
     */
    @Override
    public URI fetchCloudLog() {
        return null;
    }

    /**
     * Queries Log with LogQueryVo.
     *
     * @param query query
     * @return LogVos that match query
     */
    @Override
    public LogVo[] query(LogQueryVo query) {
        return new LogVo[0];
    }
}
