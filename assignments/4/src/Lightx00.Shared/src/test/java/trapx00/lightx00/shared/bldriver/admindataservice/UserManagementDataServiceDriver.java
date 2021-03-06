package trapx00.lightx00.shared.bldriver.admindataservice;

import org.junit.Test;
import trapx00.lightx00.shared.dataservice.admindataservice.UserManagementDataService;
import trapx00.lightx00.shared.dataservicestub.admindataservice.UserManagementDataServiceStub;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.employee.EmployeePosition;
import trapx00.lightx00.shared.po.ResultMessage;

import static org.junit.Assert.*;

public class UserManagementDataServiceDriver {
    UserManagementDataService service = new UserManagementDataServiceStub();
    EmployeePo account = service.query("张三","001",EmployeePosition.Admin)[0];
    @Test
    public void query() throws Exception {
        assertEquals("001",account.getId());
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