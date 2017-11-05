package trapx00.lightx00.shared.dataservice.logindataservice;

import trapx00.lightx00.shared.po.employee.EmployeePo;

public interface LoginDataService {
    /**
     * Login.
     * @param username username
     * @param password password
     * @return EmployeePo if login is successful
     */
    EmployeePo login(String username, String password);
}
