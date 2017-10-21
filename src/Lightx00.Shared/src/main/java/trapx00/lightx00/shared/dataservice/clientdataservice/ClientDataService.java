package trapx00.lightx00.shared.dataservice.clientdataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.client.ClientPo;

interface  ClientDataService{
    public ClientPo[] query(String query);//查询客户
    public ResultMessage modify(ClientPo client);//修改客户信息
    public ResultMessage add(ClientPo client);//增加客户
    public ResultMessage delete(ClientPo[] client);//删除客户
    public ClientPo detail(ClientPo[] client);//获得客户详细信息
}