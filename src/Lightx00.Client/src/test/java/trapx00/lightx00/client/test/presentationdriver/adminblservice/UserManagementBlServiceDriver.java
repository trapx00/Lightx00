package trapx00.lightx00.client.test.presentationdriver.adminblservice;
import org.junit.Test;
import trapx00.lightx00.client.blservice.adminblservice.UserManagementBlService;
import trapx00.lightx00.client.blservicestub.adminblservice.UserManagementBlServiceStub;
import trapx00.lightx00.client.vo.financestaff.FinanceStaffVo;
import trapx00.lightx00.shared.po.employee.EmployeePosition;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.EmployeeVo;

import java.util.Date;

import static org.junit.Assert.*;

public class UserManagementBlServiceDriver {

    private UserManagementBlService service = new UserManagementBlServiceStub();

    @Test
    public void add() {
        EmployeeVo newUserAccount = new FinanceStaffVo("张三","001",new Date(),"10081");
        assertEquals(ResultMessage.Success,service.add(newUserAccount));
    }

    @Test
    public void modify() {
        EmployeeVo newUserAccount = new FinanceStaffVo("张三","001",new Date(),"10081");
        assertEquals(ResultMessage.Success,service.modify(newUserAccount));
    }

    @Test
    public void query() {
        assertEquals("001",service.query(x->true)[0].getId());
    }

    @Test
    public void delete() {
        EmployeeVo account = new FinanceStaffVo("张三","001",new Date(),"10081");
        assertEquals(ResultMessage.Success,service.delete(account));
    }

}