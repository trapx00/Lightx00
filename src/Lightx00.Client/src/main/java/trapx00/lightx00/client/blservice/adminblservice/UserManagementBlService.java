package trapx00.lightx00.client.blservice.adminblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.shared.queryvo.UserAccountQueryVo;

public interface UserManagementBlService {

    ResultMessage add(EmployeeVo newUserAccount);

    ResultMessage modify(EmployeeVo account);

    EmployeeVo[] query(UserAccountQueryVo query);

    ResultMessage delete(EmployeeVo account);

}
