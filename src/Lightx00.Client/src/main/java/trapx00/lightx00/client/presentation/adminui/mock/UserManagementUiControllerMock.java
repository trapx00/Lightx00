package trapx00.lightx00.client.presentation.adminui.mock;

import trapx00.lightx00.client.presentation.adminui.UserManagementUiController;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.financestaff.FinanceStaffVo;

import java.util.Date;

public class UserManagementUiControllerMock extends UserManagementUiController {
    /**
     * Show a dialog about employees for fianceStaff to choose.
     * @return what have been chosen
     */
    @Override
    public EmployeeVo[] showEmployeeSelectDialog() {
        return new EmployeeVo[]{new FinanceStaffVo("张三","0001",new Date(),"10081")};
    }
}
