package trapx00.lightx00.shared.dataservice.logindataservice;

import trapx00.lightx00.shared.po.ResultMessage;

public interface LoginDataService {
    ResultMessage login(String username, String password);
}
