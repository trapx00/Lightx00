package trapx00.lightx00.client.bl.approvalbl;

import trapx00.lightx00.client.blservice.adminblservice.UserManagementBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.EmployeeVo;
import trapx00.lightx00.shared.vo.admin.UserAccountQueryVo;

public class AuditBlController implements UserManagementBlService {
    @Override
    public ResultMessage add(EmployeeVo newUserAccount) {
        return null;
    }

    @Override
    public ResultMessage modify(EmployeeVo newUserAccount) {
        return null;
    }

    @Override
    public EmployeeVo[] query(UserAccountQueryVo query) {
        return new EmployeeVo[0];
    }

    @Override
    public ResultMessage delete(EmployeeVo account) {
        return null;
    }
}
