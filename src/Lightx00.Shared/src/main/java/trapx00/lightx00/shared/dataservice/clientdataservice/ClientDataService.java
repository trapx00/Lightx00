package trapx00.lightx00.shared.dataservice.clientdataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.client.ClientPO;

interface  ClientDataService{
    public ClientPO[] query(String query);//查询客户
    public ResultMessage modify(ClientPO client);//修改客户信息
    public ResultMessage add(ClientPO client);//增加客户
    public ResultMessage delete(ClientPO[] client);//删除客户
    public ClientPO detail(ClientPO[] client);//获得客户详细信息
}