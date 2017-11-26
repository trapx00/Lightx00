package trapx00.lightx00.shared.dataservice.logdataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.log.LogPo;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.queryvo.LogQueryVo;

import java.net.URI;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LogDataService extends Remote {

    /**
     * Writes log.
     *
     * @param severity Log severity
     * @param content  content
     * @return whether the operation is done successfully
     */
    ResultMessage log(LogSeverity severity, String content) throws RemoteException;

    /**
     * Queries log.
     *
     * @param query query
     * @return LogVos that match query condition
     */
    LogPo[] query(LogQueryVo query) throws RemoteException;


    /**
     * back up the log information on the server to oos and clear the log
     *
     * @return whether the operation is done successfully
     */
    ResultMessage backupLog();

    /**
     * get the log backed up on the cloud
     *
     * @return the temp uri of the log resources
     */
    URI fetchCloudLog();
}
