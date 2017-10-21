package trapx00.lightx00.client.blservice.loginblservice;

import trapx00.lightx00.shared.po.ResultMessage;

public interface LoginBLService {
    ResultMessage login(String username, String password);
}
