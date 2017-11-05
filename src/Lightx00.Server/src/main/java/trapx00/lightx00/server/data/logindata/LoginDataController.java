package trapx00.lightx00.server.data.logindata;

import trapx00.lightx00.shared.dataservice.logindataservice.LoginDataService;
import trapx00.lightx00.shared.po.employee.EmployeePo;

public class LoginDataController implements LoginDataService {
    /**
     * Login.
     *
     * @param username username
     * @param password password
     * @return EmployeePo if login is successful
     */
    @Override
    public EmployeePo login(String username, String password) {
        return null;
    }
}
