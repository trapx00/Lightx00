package trapx00.lightx00.client.blservice.loginblservice;

import trapx00.lightx00.shared.vo.EmployeeVo;

public interface LoginBlService {

    EmployeeVo login(String username, String password);
}
