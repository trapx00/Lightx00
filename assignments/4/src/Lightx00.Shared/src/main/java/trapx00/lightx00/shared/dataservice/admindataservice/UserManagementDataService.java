package trapx00.lightx00.shared.dataservice.admindataservice;

import trapx00.lightx00.shared.po.employee.EmployeePosition;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.employee.EmployeePo;

public interface UserManagementDataService {
    EmployeePo[] query(String name, String id,EmployeePosition positoin);

    ResultMessage add(EmployeePo account);

    ResultMessage modify(EmployeePo account);

    ResultMessage delete(EmployeePo account);
}
