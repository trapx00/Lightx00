package trapx00.lightx00.client.bl.adminbl.mock;

import trapx00.lightx00.client.bl.adminbl.EmployeeInfo;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.client.vo.financestaff.FinanceStaffVo;

import java.util.Date;

public class EmployeeInfoMock implements EmployeeInfo {
    /**
     * Queries EmployeeVo by id.
     *
     * @param id id
     * @return EmployeeVo if found. Null otherwise.
     */
    @Override
    public EmployeeVo queryById(String id) {
        return new FinanceStaffVo("123",id,new Date(),"123","0001");
    }
}
