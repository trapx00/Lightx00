package trapx00.lightx00.client.presentation.mainui;

import javafx.event.ActionEvent;
import trapx00.lightx00.client.presentation.adminui.FaceIdRegistrationUiController;
import trapx00.lightx00.client.presentation.adminui.UserManagementUiController;

public class AdminStaffUiController extends FrameworkUiController {

    public void initialize() {
        // 必须有。调用基类初始化来初始化基类的元素。
        super.initialize();
        // 如果还需要初始化自己的元素请接着写。
    }

    public void onUserManagementFunctionClicked(ActionEvent actionEvent) {
        switchFunction(UserManagementUiController.class, "管理职员信息",true);
    }

    public void onFaceIdRegistrationFunctionClicked(ActionEvent actionEvent) {
        switchFunction(FaceIdRegistrationUiController.class, "注册FaceId",true);
    }
    public void onLogBackUpFunctionClicked(ActionEvent actionEvent) {
       // switchFunction(UserManagementUiController.class, "云备份日志",true);
    }
}
