package trapx00.lightx00.server.test.data.logdata;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.table.TableUtils;
import org.junit.Before;
import org.junit.Test;
import trapx00.lightx00.server.data.logdata.factory.LogDataDaoFactory;
import trapx00.lightx00.server.data.logdata.factory.LogDataFactory;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.dataservice.logdataservice.LogDataService;
import trapx00.lightx00.shared.po.log.LogPo;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.queryvo.LogQueryVo;

import java.sql.SQLException;
import java.util.Arrays;
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
    private LogDataService service = LogDataFactory.getService();
    private Dao<LogPo, Integer> dao = LogDataDaoFactory.getLogDao();
    private LogPo logPo = new LogPo(new Date(), LogSeverity.Success, "123");

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void backupLog() throws Exception{

    }

    @Test
    public void fetchCloudLog() throws Exception{

    }

}
