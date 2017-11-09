package trapx00.lightx00.client.bl.adminbl.mock;

import trapx00.lightx00.client.bl.adminbl.AdminBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.admin.UserAccountQueryVo;

public class AdminBlControllerMock extends AdminBlController {
    /**
     * create a user account for a new employee
     * @param newUserAccount a user account to be created
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(EmployeeVo newUserAccount) {
        return super.add(newUserAccount );
    }

    /**
     * modify some informatin of a user account
     * @param account a ueser account to be modified
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(EmployeeVo account) {
        return super.modify(account);
    }

    /**
     * filter some user accounts
     * @param query conditions to filter
     * @return array of user accounts which match the conditions
     */
    @Override
    public EmployeeVo[] query(UserAccountQueryVo query) {
        return super.query(query);
    }

    /**
     * delete an needless user account
     * @param account the user account to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(EmployeeVo account) {
        return super.delete(account);
    }
}
