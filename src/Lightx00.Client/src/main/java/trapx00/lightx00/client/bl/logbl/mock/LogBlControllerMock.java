package trapx00.lightx00.client.bl.logbl.mock;

import trapx00.lightx00.client.bl.logbl.LogBlController;
import trapx00.lightx00.client.vo.log.LogVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.queryvo.LogQueryVo;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;

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
        return ResultMessage.Success;
    }

    /**
     * Queries Log with LogQueryVo.
     *
     * @param query query
     * @return LogVos that match query
     */
    @Override
    public LogVo[] query(LogQueryVo query) {
        return new LogVo[]{new LogVo(new Date(), LogSeverity.Success, "123")};
    }

    /**
     * back up the log information on the server to oos and clear the log
     *
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage backupLog() {
        return ResultMessage.Success;
    }

    /**
     * get the log backed up on the cloud
     *
     * @return the temp uri of the log resources
     */
    @Override
    public URI fetchCloudLog() {
        URI uri = null;
        try {
            uri = new URI("www.123.com");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return uri;
    }
}
