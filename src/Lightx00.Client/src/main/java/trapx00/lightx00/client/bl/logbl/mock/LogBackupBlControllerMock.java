package trapx00.lightx00.client.bl.logbl.mock;

import trapx00.lightx00.client.bl.logbl.LogBackupBlController;
import trapx00.lightx00.shared.po.ResultMessage;

import java.net.URI;
import java.net.URISyntaxException;

public class LogBackupBlControllerMock extends LogBackupBlController {
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
