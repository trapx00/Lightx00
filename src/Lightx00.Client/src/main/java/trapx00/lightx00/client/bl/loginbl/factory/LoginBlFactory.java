package trapx00.lightx00.client.bl.loginbl.factory;

import trapx00.lightx00.client.bl.loginbl.LoginBlController;
import trapx00.lightx00.client.bl.loginbl.mock.LoginBlControllerMock;

public class LoginBlFactory {
    private static LoginBlController controller = new LoginBlController();

    public static LoginBlController getController() {
        return controller;
    }
}
