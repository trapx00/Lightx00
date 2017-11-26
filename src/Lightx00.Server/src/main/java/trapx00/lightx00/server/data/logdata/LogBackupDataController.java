package trapx00.lightx00.server.data.logdata;

import com.j256.ormlite.dao.Dao;
import trapx00.lightx00.server.data.logdata.factory.LogDataDaoFactory;
import trapx00.lightx00.shared.dataservice.logdataservice.LogBackupDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.log.LogPo;

import java.net.URI;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class LogBackupDataController extends UnicastRemoteObject implements LogBackupDataService {
    private Dao<LogPo, Integer> logDao = LogDataDaoFactory.getLogDao();

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
    public LogBackupDataController() throws RemoteException {
    }

    /**
     * back up the log information on the server to oos and clear the log
     *
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage backupLog() throws RemoteException {
        
        return null;
    }

    /**
     * get the log backed up on the cloud
     *
     * @return the temp uri of the log resources
     */
    @Override
    public URI fetchCloudLog() throws RemoteException {
        return null;
    }
}
