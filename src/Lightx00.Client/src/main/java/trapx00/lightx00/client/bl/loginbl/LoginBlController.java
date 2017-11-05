package trapx00.lightx00.client.bl.loginbl;

import trapx00.lightx00.client.blservice.loginblservice.LoginBlService;
import trapx00.lightx00.shared.vo.EmployeeVo;

public class LoginBlController implements LoginBlService, CurrentUserService {
    private EmployeeVo currentUser;
    /**
     * Login with username and password provided.
     *
     * @param username username
     * @param password password
     * @return EmployeeVo is login is successful
     */
    @Override
    public EmployeeVo login(String username, String password) {
        return null;
    }

    /**
     * Gets current logged-in user.
     *
     * @return current user
     */
    @Override
    public EmployeeVo getCurrentUser() {
        return currentUser;
    }
}
