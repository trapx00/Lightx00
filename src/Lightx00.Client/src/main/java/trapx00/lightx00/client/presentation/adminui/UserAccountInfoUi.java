package trapx00.lightx00.client.presentation.adminui;

import trapx00.lightx00.client.vo.EmployeeVo;

public interface UserAccountInfoUi {
    /**
     * Show a dialog about employees for fianceStaff to choose.
     * @return what have been chosen
     */
    EmployeeVo[] showEmployeeSelectDialog();
}
