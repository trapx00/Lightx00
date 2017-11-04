package trapx00.lightx00.client.blservice.clientblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.salestaff.ClientVo;

public interface ClientBlService {

    /**
     * query for client
     * @param query condition
     * @return client array whose information includes query condition
     */
    ClientVo[] query(String query);

    /**
     *
     * @param client
     * @return
     */
    ResultMessage saveAsDraft(ClientVo client);//保存客户信息为草稿

    String getId();//获得新的ID

    ResultMessage modify(ClientVo client);//修改客户信息

    ResultMessage add(ClientVo client);//新增客户

    ResultMessage delete(ClientVo[] client);//删除客户

    ClientVo detail(ClientVo client);//查询客户详细信息
}