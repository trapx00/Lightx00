package trapx00.lightx00.client.bl.clientbl;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.salestaff.ClientVo;

public interface ClientModificationService {

    /**
     * modify the information of client
     * @param client infomation sealed in ClientVo
     * @return Result:SECCESS or FAILED
     */
    ResultMessage modifyClient(ClientVo client);
}
