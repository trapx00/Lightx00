package trapx00.lightx00.shared.dataservicestub.clientdataservice;

import trapx00.lightx00.shared.dataservice.clientdataservice.ClientDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.client.ClientPo;
import trapx00.lightx00.shared.po.client.ClientType;

public class ClientDataServiceStub implements ClientDataService{
    @Override
    public ClientPo[] query(String query) {
        ClientPo[] clientPos=new ClientPo[1];
        clientPos[0]=new ClientPo("0",
                ClientType.Retailer,
                1,
                "xiaoming",
                "12345678",
                "12345678",
                "210000",
                "12345679@qq.com",
                123,
                456,
                "0");
        return clientPos;
    }

    @Override
    public ResultMessage modify(ClientPo client) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage add(ClientPo client) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage delete(ClientPo[] client) {
        return ResultMessage.Success;
    }

    @Override
    public ClientPo detail(ClientPo client) {
        ClientPo clientPo=new ClientPo("0",
                ClientType.Retailer,
                1,
                "xiaoming",
                "12345678",
                "12345678",
                "210000",
                "12345679@qq.com",
                123,
                456,
                "0");
        return clientPo;
    }
}
