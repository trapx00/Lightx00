package trapx00.lightx00.server.test.data.admindata;

import org.junit.Test;
import trapx00.lightx00.server.data.admindata.factory.AdminDataFactory;
import trapx00.lightx00.shared.dataservice.admindataservice.UserManagementDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.manager.ManagerPo;

import java.util.Date;

import static org.junit.Assert.*;

public class UserManagementDataControllerTest {
    private UserManagementDataService service = AdminDataFactory.getService();
    private EmployeePo account = new ManagerPo("张三","0001",new Date(),"张三","123456");

    @Test
    public void query() throws Exception {
        assertEquals("0001",service.query(x->true)[0].getId());
    }

    @Test
    public void add() throws Exception {
        assertEquals(ResultMessage.Success,service.add(account));
    }

    @Test
    public void modify() throws Exception {
        assertEquals(ResultMessage.Success,service.modify(account));
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success,service.delete(account));
    }

}