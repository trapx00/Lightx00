package trapx00.lightx00.shared.dataservice.admindataservice;

import trapx00.lightx00.shared.po.EmployeePosition;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.EmployeePo;

public interface UserManagementDataService {
    EmployeePo[] query(String name, String id,EmployeePosition positoin);

    ResultMessage add(EmployeePo account);

    ResultMessage modify(EmployeePo account);

    ResultMessage delete(EmployeePo account);
}
