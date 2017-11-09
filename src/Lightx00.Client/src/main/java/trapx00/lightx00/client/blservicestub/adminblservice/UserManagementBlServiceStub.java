package trapx00.lightx00.client.blservicestub.adminblservice;

import trapx00.lightx00.client.blservice.adminblservice.UserManagementBlService;
import trapx00.lightx00.shared.po.employee.EmployeePosition;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.admin.UserAccountQueryVo;
import trapx00.lightx00.client.vo.EmployeeVo;

import java.util.Date;

public class UserManagementBlServiceStub implements UserManagementBlService {
    @Override
    public ResultMessage add(EmployeeVo newUserAccount){
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage modify(EmployeeVo newUserAccount) {
        return ResultMessage.Success;
    }

    @Override
    public EmployeeVo[] query(UserAccountQueryVo query) {
        return new EmployeeVo[]{
                new EmployeeVo(query.getName(),"001",new Date(),"10081", EmployeePosition.Admin)
        };
    }

    @Override
    public ResultMessage delete(EmployeeVo account) {
        return ResultMessage.Success;
    }

}
