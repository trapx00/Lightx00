package trapx00.lightx00.client.blservicestub.adminblservice;

import trapx00.lightx00.client.blservice.adminblservice.UserManagementBlService;
import trapx00.lightx00.client.vo.financestaff.FinanceStaffVo;
import trapx00.lightx00.shared.po.employee.EmployeePosition;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.shared.queryvo.UserAccountQueryVo;

import java.util.Date;

public class UserManagementBlServiceStub implements UserManagementBlService {
    /**
     * create a user account for a new employee
     * @param account a user account to be created
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(EmployeeVo account) {
        return ResultMessage.Success;
    }

    /**
     * modify some informatin of a user account
     * @param account a ueser account to be modified
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(EmployeeVo account) {
        return ResultMessage.Success;
    }

    /**
     * query a user account
     * @param query the filter conditions
     * @return array of EmployeeVo which match the conditions
     */
    @Override
    public EmployeeVo[] query(UserAccountQueryVo query) {
        return new EmployeeVo[]{
                new FinanceStaffVo("张三","0001",new Date(),"张三")
        };
    }

    /**
     * delete an needless user account
     * @param account the user account to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(EmployeeVo account) {
        return ResultMessage.Success;
    }

}
