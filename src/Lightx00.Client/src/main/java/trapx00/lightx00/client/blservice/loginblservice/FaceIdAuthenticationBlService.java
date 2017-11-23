package trapx00.lightx00.client.blservice.loginblservice;

import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.shared.po.employee.EmployeePo;

public interface FaceIdAuthenticationBlService {
    /**
     * Login with image.
     * @param bytes image in bytes
     * @return EmployeeVo if authenticated. null otherwise.
     */
    EmployeeVo authenticate(byte[] bytes);
}
