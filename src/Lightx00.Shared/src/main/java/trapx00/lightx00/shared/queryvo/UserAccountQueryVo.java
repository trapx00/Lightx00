package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.employee.EmployeePosition;

import java.util.HashMap;

public class UserAccountQueryVo  {
    private HashMap<EmployeePosition, SpecificUserAccountQueryVo> specificUserAccoutQueryVoHashMap = new HashMap<>();

    public UserAccountQueryVo addQueryVoForOneEmployeePosition(EmployeePosition employeePosition, SpecificUserAccountQueryVo specificUserAccountQueryVo) {
        specificUserAccoutQueryVoHashMap.put(employeePosition, specificUserAccountQueryVo);
        return this;
    }

    public SpecificUserAccountQueryVo getQueryVoForPosition(EmployeePosition employeePosition) {
        return specificUserAccoutQueryVoHashMap.get(employeePosition);
    }

    public UserAccountQueryVo addQueryVoForAllEmployeePosition(SpecificUserAccountQueryVo queryVo) {
        for (EmployeePosition position : EmployeePosition.values()) {
            specificUserAccoutQueryVoHashMap.put(position, queryVo);
        }
        return this;
    }



}
