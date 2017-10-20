package trapx00.lightx00.client.blservice.logblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.vo.log.LogQueryVO;
import trapx00.lightx00.shared.vo.log.LogVO;

public interface LogBLService {
    ResultMessage log(LogSeverity severity, String content);
    LogVO[] query(LogQueryVO query);
}
