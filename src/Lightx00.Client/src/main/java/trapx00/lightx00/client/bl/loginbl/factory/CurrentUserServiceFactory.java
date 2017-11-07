package trapx00.lightx00.client.bl.loginbl.factory;

import trapx00.lightx00.client.bl.loginbl.CurrentUserService;

public class CurrentUserServiceFactory {
    private static CurrentUserService instance;

    /**
     * Gets a CurrentUserService instance.
     * @return CurrentUserService instance
     */
    public static CurrentUserService getInstance() {
        return instance;
    }
}
