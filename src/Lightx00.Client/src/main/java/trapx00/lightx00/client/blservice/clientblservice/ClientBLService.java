package trapx00.lightx00.client.blservice.clientblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.salestaff.ClientVO;

interface  ClientBLService{
    public ClientVO[] query(String query);//查询客户信息
    public ResultMessage saveAsDraft(ClientVO client);//保存客户信息为草稿
    public ResultMessage modify(ClientVO client);//修改客户信息
    public ResultMessage add(ClientVO client);//新增客户
    public ResultMessage delete(ClientVO[] client);//删除客户
    public ClientVO detail(ClientVO[] client);//查询客户详细信息
}