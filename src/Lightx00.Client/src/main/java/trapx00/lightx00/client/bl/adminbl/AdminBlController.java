package trapx00.lightx00.client.bl.adminbl;

import trapx00.lightx00.client.blservice.adminblservice.UserManagementBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.admin.UserAccountQueryVo;

public class AdminBlController implements UserManagementBlService {

    /**
     * create a user account for a new employee
     * @param newUserAccount a user account to be created
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(EmployeeVo newUserAccount) {
        return null;
    }

    /**
     * modify some informatin of a user account
     * @param account a ueser account to be modified
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(EmployeeVo account) {
        return null;
    }

    /**
     * filter some user accounts
     * @param query conditions to filter
     * @return array of user accounts which match the conditions
     */
    @Override
    public EmployeeVo[] query(UserAccountQueryVo query) {
        return new EmployeeVo[0];
    }

    /**
     * delete an needless user account
     * @param account the user account to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(EmployeeVo account) {
        return null;
    }
}
