package trapx00.lightx00.server.data.logindata.mock;

import trapx00.lightx00.server.data.logindata.LoginDataController;
import trapx00.lightx00.shared.po.employee.EmployeePo;

public class LoginDataControllerMock extends LoginDataController {
    /**
     * Login.
     *
     * @param username username
     * @param password password
     * @return EmployeePo if login is successful
     */
    @Override
    public EmployeePo login(String username, String password) {
        return super.login(username, password);
    }
}
