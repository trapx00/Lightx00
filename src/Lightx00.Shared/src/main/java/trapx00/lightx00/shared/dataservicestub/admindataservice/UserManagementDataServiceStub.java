package trapx00.lightx00.shared.dataservicestub.admindataservice;

import trapx00.lightx00.shared.dataservice.admindataservice.UserManagementDataService;
import trapx00.lightx00.shared.po.EmployeePosition;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.EmployeePo;

import java.util.Date;

public class UserManagementDataServiceStub implements UserManagementDataService {
    @Override
    public EmployeePo[] query(String name, String id,EmployeePosition position) {
        return new EmployeePo[]{
                new EmployeePo(name,id,new Date(),"","",position)};
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
