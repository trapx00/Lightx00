package trapx00.lightx00.client.bl.loginbl.mock;

import trapx00.lightx00.client.bl.loginbl.LoginBlController;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.financestaff.FinanceStaffVo;

import java.util.Date;

public class LoginBlControllerMock extends LoginBlController {
    private EmployeeVo user = new FinanceStaffVo("123","123",new Date(), "123");;
    /**
     * Login with username and password provided.
     *
     * @param username username
     * @param password password
     * @return EmployeeVo is login is successful
     */
    @Override
    public EmployeeVo login(String username, String password) {
        return user;
    }

    /**
     * Gets current logged-in user.
     *
     * @return current user
     */
    @Override
    public EmployeeVo getCurrentUser() {
        return user;
    }
}
