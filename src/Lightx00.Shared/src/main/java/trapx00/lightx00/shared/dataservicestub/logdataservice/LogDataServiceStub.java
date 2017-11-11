package trapx00.lightx00.shared.dataservicestub.logdataservice;

import trapx00.lightx00.shared.dataservice.logdataservice.LogDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.log.LogPo;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.queryvo.LogQueryVo;

import java.rmi.RemoteException;
import java.util.Date;

public class LogDataServiceStub implements LogDataService {

    /**
     * Writes log.
     *
     * @param severity Log severity
     * @param content  content
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage log(LogSeverity severity, String content) throws RemoteException {
        return ResultMessage.Success;
    }

    /**
     * Queries log.
     *
     * @param query query
     * @return LogVos that match query condition
     */
    @Override
    public LogPo[] query(LogQueryVo query) throws RemoteException {
        return new LogPo[] {
                new LogPo(new Date(), LogSeverity.Success,"123")
        };
    }
}
