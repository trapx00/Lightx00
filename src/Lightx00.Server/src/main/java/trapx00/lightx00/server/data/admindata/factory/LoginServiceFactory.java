package trapx00.lightx00.server.data.admindata.factory;

import trapx00.lightx00.server.data.admindata.LoginService;
import trapx00.lightx00.server.data.admindata.mock.LoginServiceMock;

public class LoginServiceFactory {
    private static LoginService service = new LoginServiceMock();

    public static LoginService getService() {
        return service;
    }
}
