package trapx00.lightx00.server.data.logindata.factory;

import trapx00.lightx00.server.data.logindata.mock.LoginDataControllerMock;
import trapx00.lightx00.shared.dataservice.logindataservice.LoginDataService;

public class LoginDataFactory {
    private LoginDataService service = new LoginDataControllerMock();

    public LoginDataService getService() {
        return service;
    }
}
