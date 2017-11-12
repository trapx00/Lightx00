package trapx00.lightx00.client.test.bl.adminbl;

import org.junit.Test;
import trapx00.lightx00.client.bl.adminbl.AdminBlController;
import trapx00.lightx00.client.bl.adminbl.mock.AdminBlControllerMock;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.financestaff.FinanceBillVo;
import trapx00.lightx00.client.vo.financestaff.FinanceStaffVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.employee.EmployeePosition;

import java.util.Date;

import static org.junit.Assert.*;

public class AdminBlControllerTest {
    private AdminBlController controller = new AdminBlControllerMock();
    private FinanceStaffVo account = new FinanceStaffVo("张三","0001",new Date(),"张三");
    private EmployeeVo[] accounts = {account};
    @Test
    public void add() throws Exception {
        assertEquals(ResultMessage.Success,controller.add(account));
    }

    @Test
    public void modify() throws Exception {
        assertEquals(ResultMessage.Success,controller.modify(account));
    }

    @Test
    public void query() throws Exception {
        assertEquals(accounts[0],controller.query(x->true));
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success,controller.delete(account));
    }

}