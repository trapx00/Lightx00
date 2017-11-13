package trapx00.lightx00.shared.dataservicestub.admindataservice;

import trapx00.lightx00.shared.dataservice.admindataservice.UserManagementDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.financestaff.FinanceStaffPo;
import trapx00.lightx00.shared.queryvo.UserAccountQueryVo;

import java.util.Date;

public class UserManagementDataServiceStub implements UserManagementDataService {

    /**
     * filter some user accounts
     * @param query the filter conditions
     * @return array of user accounts which match the conditions
     */
    @Override
    public EmployeePo[] query(UserAccountQueryVo query) {
        return new EmployeePo[]{
                new FinanceStaffPo("张三","0001",new Date(),"张三","123456")
        };
    }

    /**
     * create a user account for a new employee
     * @param account the account to be created
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(EmployeePo account) {
        return ResultMessage.Success;
    }

    /**
     * modify a user account
     * @param account the account to be modified
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(EmployeePo account) {
        return ResultMessage.Success;
    }

    /**
     * delete a user account
     * @param account the account to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(EmployeePo account) {
        return ResultMessage.Success;
    }
}
