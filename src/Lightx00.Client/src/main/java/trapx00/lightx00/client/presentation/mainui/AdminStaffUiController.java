package trapx00.lightx00.client.presentation.mainui;

import javafx.event.ActionEvent;
import trapx00.lightx00.client.presentation.adminui.UserManagementUiController;

public class AdminStaffUiController extends FrameworkUiController {

    public void initialize() {
        // 必须有。调用基类初始化来初始化基类的元素。
        super.initialize();
        // 如果还需要初始化自己的元素请接着写。
    }

    public void onUserManagementFunctionClicked(ActionEvent actionEvent) {
        switchFunction(UserManagementUiController.class, "职员信息管理",true);
    }

}
