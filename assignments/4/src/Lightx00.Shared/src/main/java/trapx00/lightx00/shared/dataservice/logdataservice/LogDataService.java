package trapx00.lightx00.shared.dataservice.logdataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.vo.log.LogQueryVo;
import trapx00.lightx00.shared.vo.log.LogVo;

public interface LogDataService {

    ResultMessage log(LogSeverity severity, String content);

    LogVo[] query(LogQueryVo query);
}
