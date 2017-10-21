package trapx00.lightx00.shared.dataservice.logindataservice;

import trapx00.lightx00.shared.po.EmployeePo;

public interface LoginDataService {
    EmployeePo login(String username, String password);
}
