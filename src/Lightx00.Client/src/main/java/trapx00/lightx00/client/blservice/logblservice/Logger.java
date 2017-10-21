package trapx00.lightx00.client.blservice.logblservice;

import trapx00.lightx00.shared.vo.log.LogQueryVO;
import trapx00.lightx00.shared.vo.log.LogVO;

public interface Logger {
    LogVO[] query(LogQueryVO query);
}
