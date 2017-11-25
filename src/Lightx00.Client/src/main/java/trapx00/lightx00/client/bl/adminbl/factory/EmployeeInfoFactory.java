package trapx00.lightx00.client.bl.adminbl.factory;

import trapx00.lightx00.client.bl.adminbl.EmployeeInfo;
import trapx00.lightx00.client.bl.adminbl.mock.EmployeeInfoMock;

public class EmployeeInfoFactory {
    private static EmployeeInfo employeeInfo = new EmployeeInfoMock();

    public static EmployeeInfo getEmployeeInfo() {
        return employeeInfo;
    }
}
