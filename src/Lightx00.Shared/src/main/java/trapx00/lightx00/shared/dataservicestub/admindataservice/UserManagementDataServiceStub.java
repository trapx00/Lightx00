package trapx00.lightx00.shared.dataservicestub.admindataservice;

import trapx00.lightx00.shared.dataservice.admindataservice.UserManagementDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.client.vo.admin.UserAccountQueryVo;

import java.util.Date;

public class UserManagementDataServiceStub implements UserManagementDataService {
    @Override
    public EmployeePo[] query(UserAccountQueryVo query) {
        return new EmployeePo[]{
                new EmployeePo(query.getName(),query.getId(),new Date(),"","",query.getPosition())};
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
