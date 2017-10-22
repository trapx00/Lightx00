package trapx00.lightx00.shared.dataservicestub.logindataservice;

import java.util.Date;
import trapx00.lightx00.shared.dataservice.logindataservice.LoginDataService;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.employee.EmployeePosition;


public class LoginDataServiceStub implements LoginDataService {
    @Override
    public EmployeePo login(String username, String password) {
        return new EmployeePo(username, "123", new Date(),
                username,password, EmployeePosition.Admin);
    }
}
