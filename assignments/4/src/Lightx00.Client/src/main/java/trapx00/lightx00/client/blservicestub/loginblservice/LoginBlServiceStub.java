package trapx00.lightx00.client.blservicestub.loginblservice;

import java.util.Date;
import trapx00.lightx00.client.blservice.loginblservice.LoginBlService;
import trapx00.lightx00.shared.po.employee.EmployeePosition;
import trapx00.lightx00.shared.vo.EmployeeVo;


public class LoginBlServiceStub implements LoginBlService {
    @Override
    public EmployeeVo login(String username, String password) {
        return new EmployeeVo(username,"123", new Date(), username, EmployeePosition.Admin);
    }

}
