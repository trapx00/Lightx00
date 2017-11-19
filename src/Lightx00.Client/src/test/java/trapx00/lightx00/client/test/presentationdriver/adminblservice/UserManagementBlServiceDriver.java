package trapx00.lightx00.client.test.presentationdriver.adminblservice;
import org.junit.Test;
import trapx00.lightx00.client.blservice.adminblservice.UserManagementBlService;
import trapx00.lightx00.client.blservicestub.adminblservice.UserManagementBlServiceStub;
import trapx00.lightx00.client.vo.financestaff.FinanceStaffVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.EmployeeVo;

import java.util.Date;

import static org.junit.Assert.*;

public class UserManagementBlServiceDriver {
    private UserManagementBlService service = new UserManagementBlServiceStub();
    private EmployeeVo account = new FinanceStaffVo("张三","0001",new Date(),"10081");

    @Test
    public void add() {
        assertEquals(ResultMessage.Success,service.add(account));
    }

    @Test
    public void modify() {
        assertEquals(ResultMessage.Success,service.modify(account));
    }

    @Test
    public void query() {
        assertEquals("0001",service.query(x->true)[0].getId());
    }

    @Test
    public void delete() {
        assertEquals(ResultMessage.Success,service.delete(account));
    }
}