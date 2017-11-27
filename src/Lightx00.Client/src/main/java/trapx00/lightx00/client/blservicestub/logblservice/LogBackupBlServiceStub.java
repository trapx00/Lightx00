package trapx00.lightx00.client.blservicestub.logblservice;

import trapx00.lightx00.client.blservice.logblservice.LogBackupBlService;
import trapx00.lightx00.shared.dataservice.logdataservice.LogBackupDataService;
import trapx00.lightx00.shared.po.ResultMessage;

import java.net.URI;
import java.net.URISyntaxException;
import java.rmi.RemoteException;

public class LogBackupBlServiceStub implements LogBackupBlService {
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
