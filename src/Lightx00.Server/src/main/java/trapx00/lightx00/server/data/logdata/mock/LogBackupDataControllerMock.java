package trapx00.lightx00.server.data.logdata.mock;

import trapx00.lightx00.server.data.logdata.LogBackupDataController;
import trapx00.lightx00.shared.po.ResultMessage;

import java.net.URI;
import java.net.URISyntaxException;
import java.rmi.RemoteException;

public class LogBackupDataControllerMock extends LogBackupDataController {
    /**
     * Creates and exports a new UnicastRemoteObject object using an
     * anonymous port.
     * <p>
     * <p>The object is exported with a server socket
     * created using the {@link RMISocketFactory} class.
     *
     * @throws RemoteException if failed to export object
     * @since JDK1.1
     */
    public LogBackupDataControllerMock() throws RemoteException {
    }

    /**
     * back up the log information on the server to oos and clear the log
     *
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage backupLog() throws RemoteException {
        return ResultMessage.Success;
    }

    /**
     * get the log backed up on the cloud
     *
     * @return the temp uri of the log resources
     */
    @Override
    public URI fetchCloudLog() throws RemoteException {
        URI uri = null;
        try {
            uri = new URI("www.123.com");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        return uri;
    }
}
