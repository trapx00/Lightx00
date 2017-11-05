package trapx00.lightx00.client.bl.loginbl.mock;

import trapx00.lightx00.client.bl.loginbl.LoginBlController;
import trapx00.lightx00.shared.vo.EmployeeVo;

public class LoginBlControllerMock extends LoginBlController {
    /**
     * Login with username and password provided.
     *
     * @param username username
     * @param password password
     * @return EmployeeVo is login is successful
     */
    @Override
    public EmployeeVo login(String username, String password) {
        return super.login(username, password);
    }
}
