package trapx00.lightx00.shared.dataservice.logdataservice;

import trapx00.lightx00.shared.po.log.LogPO;
import trapx00.lightx00.shared.po.log.LogSeverity;

import java.util.Date;

public interface Logger {
    LogPO[] query(Date date, LogSeverity severity, String content);
}
