package trapx00.lightx00.client.presentationdriver.adminblservice;
import org.junit.Test;
import trapx00.lightx00.client.blservice.adminblservice.UserManagementBlService;
import trapx00.lightx00.client.blservicestub.adminblservice.UserManagementBlServiceStub;
import trapx00.lightx00.shared.po.employee.EmployeePosition;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.admin.UserAccountQueryVo;
import trapx00.lightx00.shared.vo.EmployeeVo;

import java.util.Date;

import static org.junit.Assert.*;

public class UserManagementBlServiceDriver {

    UserManagementBlService service = new UserManagementBlServiceStub();

    @Test
    public void add() {
        EmployeeVo newUserAccount = new EmployeeVo("张三","001",new Date(),"10081", EmployeePosition.Admin);
        assertEquals(ResultMessage.Success,service.add(newUserAccount));
    }

    @Test
    public void modify() {
        EmployeeVo newUserAccount = new EmployeeVo("张三","001",new Date(),"10081", EmployeePosition.FinanceStaff);
        assertEquals(ResultMessage.Success,service.modify(newUserAccount));
    }

    @Test
    public void query() {
        assertEquals("001",service.query(new UserAccountQueryVo("张三","001",new Date(),"10081", EmployeePosition.FinanceStaff))[0].getId());
    }

    @Test
    public void delete() {
        EmployeeVo account = new EmployeeVo("张三","001",new Date(),"10081", EmployeePosition.FinanceStaff);
        assertEquals(ResultMessage.Success,service.delete(account));
    }

}