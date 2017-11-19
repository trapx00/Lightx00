package trapx00.lightx00.client.presentation.adminui;

import trapx00.lightx00.client.vo.EmployeeVo;

public class UserManagementUiController implements UserAccountInfoUi {
    /**
     * Show a dialog about employees for fianceStaff to choose.
     * @return what have been chosen
     */
    @Override
    public EmployeeVo[] showEmployeeSelectDialog() {
        return new EmployeeVo[0];
    }
}
