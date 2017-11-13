package trapx00.lightx00.shared.dataservicestub.admindataservice;

import trapx00.lightx00.shared.dataservice.admindataservice.UserManagementDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.financestaff.FinanceStaffPo;
import trapx00.lightx00.shared.queryvo.UserAccountQueryVo;

import java.util.Date;

public class UserManagementDataServiceStub implements UserManagementDataService {
    @Override
    public EmployeePo[] query(UserAccountQueryVo query) {
        return new EmployeePo[]{
                new FinanceStaffPo("张三","0001",new Date(),"张三","123456")
        };
    }

    @Override
    public ResultMessage add(EmployeePo account) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage modify(EmployeePo account) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage delete(EmployeePo account) {
        return ResultMessage.Success;
    }
}
