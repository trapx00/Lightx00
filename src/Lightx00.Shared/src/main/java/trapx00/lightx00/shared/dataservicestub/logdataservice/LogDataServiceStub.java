package trapx00.lightx00.shared.dataservicestub.logdataservice;

import trapx00.lightx00.shared.dataservice.logdataservice.LogDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.client.vo.log.LogQueryVo;
import trapx00.lightx00.client.vo.log.LogVo;

import java.util.Date;

public class LogDataServiceStub implements LogDataService {
    @Override
    public ResultMessage log(LogSeverity severity, String content) {
        return ResultMessage.Success;
    }

    @Override
    public LogVo[] query(LogQueryVo query) {
        return new LogVo[] {
                new LogVo(new Date(), LogSeverity.Success,"123")
        };
    }
}
