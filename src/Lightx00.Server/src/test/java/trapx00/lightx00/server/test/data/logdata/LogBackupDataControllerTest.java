package trapx00.lightx00.server.test.data.logdata;

import com.j256.ormlite.dao.Dao;
import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.server.data.logdata.factory.LogBackupDataFactory;
import trapx00.lightx00.server.data.logdata.factory.LogDataDaoFactory;
import trapx00.lightx00.server.data.logdata.factory.LogDataFactory;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.dataservice.logdataservice.LogBackupDataService;
import trapx00.lightx00.shared.dataservice.logdataservice.LogDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.log.LogPo;
import trapx00.lightx00.shared.po.log.LogSeverity;

import java.sql.SQLException;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class LogBackupDataControllerTest {
    static {
        try {
            BaseDatabaseFactory.init();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private LogDataService logDataService = LogDataFactory.getService();
    private LogBackupDataService logBackupDataService = LogBackupDataFactory.getService();
    private Dao<LogPo, Integer> dao = LogDataDaoFactory.getLogDao();
    private LogPo logPo = new LogPo(new Date(), LogSeverity.Success, "123");

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void backupLog() throws Exception {
        logDataService.log(logPo.getSeverity(), logPo.getContent());
        assertEquals(ResultMessage.Success, logBackupDataService.backupLog());
    }

    @Test
    public void fetchCloudLog() throws Exception {
        assertEquals(null,logBackupDataService.fetchCloudLog());
    }

}
