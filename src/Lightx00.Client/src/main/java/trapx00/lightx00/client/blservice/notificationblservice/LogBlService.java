package trapx00.lightx00.client.blservice.notificationblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.vo.log.LogQueryVo;
import trapx00.lightx00.shared.vo.log.LogVo;

public interface LogBlService {

    ResultMessage log(LogSeverity severity, String content);

    LogVo[] query(LogQueryVo query);

}
