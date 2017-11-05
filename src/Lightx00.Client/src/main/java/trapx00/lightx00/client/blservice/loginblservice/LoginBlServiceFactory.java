package trapx00.lightx00.client.blservice.loginblservice;

import trapx00.lightx00.client.bl.loginbl.LoginBlController;

public class LoginBlServiceFactory {
    private static LoginBlService instance = new LoginBlController();

    public static LoginBlService getInstance() {
        return instance;
    }
}
