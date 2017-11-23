package trapx00.lightx00.server.test.data.logindata;

import com.j256.ormlite.dao.Dao;
import org.junit.Test;
import trapx00.lightx00.server.data.logindata.factory.LoginDataDaoFactory;
import trapx00.lightx00.server.data.logindata.factory.LoginDataFactory;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.dataservice.logindataservice.LoginDataService;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.financestaff.FinanceStaffPo;

import java.sql.SQLException;
import java.util.Date;

import static org.junit.Assert.*;

public class LoginDataControllerTest {
    static {
        try {
            BaseDatabaseFactory.init();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private Dao<EmployeePo, String> dao = LoginDataDaoFactory.getDao();
    private LoginDataService service = LoginDataFactory.getService();
    private EmployeePo employeePo = new FinanceStaffPo("123","123",new Date(),"123","123");
    @Test
    public void loginSuccess() throws Exception {
        dao.create(employeePo);
        String id = dao.extractId(employeePo);
        try {
            assertNotNull(service.login("123","123"));
        } finally {
            dao.deleteById(id);
        }
    }

    @Test
    public void loginFailed() throws Exception {
        dao.create(employeePo);
        String id = dao.extractId(employeePo);
        try {
            assertNull(service.login("123","1233"));
        } finally {
            dao.deleteById(id);
        }
    }

}