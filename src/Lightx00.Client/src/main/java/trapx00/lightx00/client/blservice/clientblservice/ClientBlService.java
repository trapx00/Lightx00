package trapx00.lightx00.client.blservice.clientblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.salestaff.ClientVo;

public interface ClientBlService {

    public ClientVo[] query(String query);//查询客户信息

    public ResultMessage saveAsDraft(ClientVo client);//保存客户信息为草稿

    public String getId();//获得新单据的ID

    public ResultMessage modify(ClientVo client);//修改客户信息

    public ResultMessage add(ClientVo client);//新增客户

    public ResultMessage delete(ClientVo[] client);//删除客户

    public ClientVo detail(ClientVo client);//查询客户详细信息
}