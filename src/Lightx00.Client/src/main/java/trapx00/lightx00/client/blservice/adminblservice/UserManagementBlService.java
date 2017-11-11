package trapx00.lightx00.client.blservice.adminblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.EmployeeVo;

public interface UserManagementBlService {

    ResultMessage add(EmployeeVo newUserAccount);

    ResultMessage modify(EmployeeVo account);

    ResultMessage delete(EmployeeVo account);
}
