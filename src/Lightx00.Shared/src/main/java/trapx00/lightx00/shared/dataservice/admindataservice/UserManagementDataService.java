package trapx00.lightx00.shared.dataservice.admindataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.client.vo.admin.UserAccountQueryVo;

public interface UserManagementDataService {
    EmployeePo[] query(UserAccountQueryVo query);

    ResultMessage add(EmployeePo account);

    ResultMessage modify(EmployeePo account);

    ResultMessage delete(EmployeePo account);
}
