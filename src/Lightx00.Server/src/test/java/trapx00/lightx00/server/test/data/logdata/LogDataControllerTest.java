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
import java.util.Comparator;
import java.util.Date;
import java.util.OptionalInt;

import static org.junit.Assert.*;

public class LogDataControllerTest {
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
    public void log() throws Exception {
        try {
            long previous = dao.countOf();
            service.log(logPo.getSeverity(), logPo.getContent());
            assertEquals(1, dao.countOf()-previous);
        } finally {
            resetTable();
        }

    }

    private void resetTable() throws Exception {
        TableUtils.dropTable(dao.getConnectionSource(),LogPo.class,true);
        TableUtils.createTable(dao.getConnectionSource(), LogPo.class);
    }

    @Test
    public void logTwiceAndCheckWhetherTheIdForTheSecondIs2() throws Exception {
        try {
            service.log(logPo.getSeverity(), logPo.getContent());
            service.log(logPo.getSeverity(), logPo.getContent());
            int second = Arrays.stream(service.query(new LogQueryVo()))
                    .mapToInt(LogPo::getId)
                    .max().orElse(-1);
            assertEquals(2, second);
        } finally {
            resetTable();
        }
    }

    @Test
    public void query() throws Exception {
        try {
            service.log(logPo.getSeverity(), logPo.getContent());
            service.log(LogSeverity.Failure, "failure");
            assertEquals(2, service.query(new LogQueryVo()).length);
            assertEquals(1, service.query(new LogQueryVo().eq("severity",LogSeverity.Failure).castBack()).length);

        } finally {
            resetTable();
        }
    }

}