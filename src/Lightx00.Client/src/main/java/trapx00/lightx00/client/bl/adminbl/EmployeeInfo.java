package trapx00.lightx00.client.bl.adminbl;

import trapx00.lightx00.client.vo.EmployeeVo;

public interface EmployeeInfo {
    /**
     * Queries EmployeeVo by id.
     * @param id id
     * @return EmployeeVo if found. Null otherwise.
     */
    EmployeeVo queryById(String id);
}
