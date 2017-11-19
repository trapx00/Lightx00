package trapx00.lightx00.client.bl.adminbl.factory;

import trapx00.lightx00.client.bl.adminbl.UserManagementBlController;
import trapx00.lightx00.client.bl.adminbl.mock.UserManagementBlControllerMock;

public class UserManagementBlFactory {
    private static UserManagementBlController controller = new UserManagementBlControllerMock();

    public static UserManagementBlController getController() {
        return controller;
    }

}
