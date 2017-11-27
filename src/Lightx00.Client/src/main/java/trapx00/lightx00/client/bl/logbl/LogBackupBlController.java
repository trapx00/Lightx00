package trapx00.lightx00.client.bl.logbl;

import trapx00.lightx00.client.blservice.logblservice.LogBackupBlService;
import trapx00.lightx00.shared.po.ResultMessage;

import java.net.URI;

public class LogBackupBlController implements LogBackupBlService {
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
}
