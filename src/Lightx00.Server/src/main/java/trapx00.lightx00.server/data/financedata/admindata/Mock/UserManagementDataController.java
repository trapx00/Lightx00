package trapx00.lightx00.server.data.financedata.admindata.Mock;

import trapx00.lightx00.server.data.UserManagementDataController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.vo.admin.UserAccountQueryVo;

public class UserManagementDataController extends UserManagementDataController {
    /**
     * filter some user accounts
     * @param query the filter conditions
     * @return array of user accounts which match the conditions
     */
    @Override
    public EmployeePo[] query(UserAccountQueryVo query) {
        return new EmployeePo[0];
    }

    /**
     * create a user account for a new employee
     * @param account the account to be created
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(EmployeePo account) {
        return null;
    }

    /**
     * modify a user account
     * @param account the account to be modified
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(EmployeePo account) {
        return null;
    }

    /**
     * delete a user account
     * @param account the account to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(EmployeePo account) {
        return null;
    }
}
