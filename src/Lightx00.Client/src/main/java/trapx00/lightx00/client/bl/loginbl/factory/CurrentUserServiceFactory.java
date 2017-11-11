package trapx00.lightx00.client.bl.loginbl.factory;

import trapx00.lightx00.client.bl.loginbl.CurrentUserService;
import trapx00.lightx00.client.bl.loginbl.mock.LoginBlControllerMock;

public class CurrentUserServiceFactory {
    private static CurrentUserService currentUserService = new LoginBlControllerMock();

    /**
     * Gets a CurrentUserService instance.
     * @return CurrentUserService instance
     */
    public static CurrentUserService getCurrentUserService() {
        return currentUserService;
    }
}
