package trapx00.lightx00.client.blservicestub.loginblservice;

import java.util.Date;
import trapx00.lightx00.client.blservice.loginblservice.LoginBlService;
import trapx00.lightx00.client.vo.financestaff.FinanceStaffVo;
import trapx00.lightx00.shared.po.employee.EmployeePosition;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.shared.po.employee.EmployeeState;


public class LoginBlServiceStub implements LoginBlService {
    @Override
    public EmployeeVo login(String username, String password) {
        return new FinanceStaffVo("10001",username,new Date(),"123456", EmployeeState.Active,true);
    }

}
