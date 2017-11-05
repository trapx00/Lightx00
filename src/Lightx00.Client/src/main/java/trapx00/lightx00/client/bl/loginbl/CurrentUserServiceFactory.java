package trapx00.lightx00.client.bl.loginbl;

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
