package trapx00.lightx00.client.bl.adminbl.factory;

import trapx00.lightx00.client.bl.adminbl.AdminBlController;
import trapx00.lightx00.client.bl.adminbl.mock.AdminBlControllerMock;

public class AdminFactory {
    private static AdminBlController controller = new AdminBlControllerMock();

    public static AdminBlController getController() {
        return controller;
    }

}
