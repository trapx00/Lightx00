package trapx00.lightx00.client.presentation.adminui.factory;

import trapx00.lightx00.client.presentation.adminui.UserAccountInfoUi;
import trapx00.lightx00.client.presentation.adminui.UserManagementUiController;
import trapx00.lightx00.client.presentation.adminui.mock.UserManagementUiControllerMock;

public class UserManagementUiFactory {
    private static UserManagementUiController controller = new UserManagementUiControllerMock();

    public static UserAccountInfoUi getController() {
        return controller;
    }
}
