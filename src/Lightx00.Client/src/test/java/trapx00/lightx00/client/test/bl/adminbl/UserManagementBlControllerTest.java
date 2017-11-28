package trapx00.lightx00.client.test.bl.adminbl;

import org.junit.Test;
import trapx00.lightx00.client.bl.adminbl.UserManagementBlController;
import trapx00.lightx00.client.bl.adminbl.factory.UserManagementBlFactory;
import trapx00.lightx00.client.vo.financestaff.FinanceStaffVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.queryvo.SpecificUserAccountQueryVo;
import trapx00.lightx00.shared.queryvo.UserAccountQueryVo;

import java.util.Date;

import static org.junit.Assert.*;

public class UserManagementBlControllerTest {
    private UserManagementBlController controller = UserManagementBlFactory.getController();
    private FinanceStaffVo account = new FinanceStaffVo("张三","0001",new Date(),"10081");

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
        assertEquals("0001",controller.query(new UserAccountQueryVo().addQueryVoForAllEmployeePosition(new SpecificUserAccountQueryVo()))[0].getId());
    }

    @Test
    public void delete() throws Exception {
        assertEquals(ResultMessage.Success,controller.delete(account));
    }

}