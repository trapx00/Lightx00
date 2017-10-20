package trapx00.lightx00.client.blservice.adminblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.admin.UserAccountQueryVO;
import trapx00.lightx00.shared.vo.admin.UserAccountVO;

public interface UserManagement {
    ResultMessage add(UserAccountVO newUserAccount);
    ResultMessage modify(UserAccountVO newUserAccount);
    ResultMessage query(UserAccountQueryVO query);
    ResultMessage delete(UserAccountVO account);
}
