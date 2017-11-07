package trapx00.lightx00.client.blservicestub.clientblservice;

import trapx00.lightx00.client.blservice.clientblservice.ClientBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.client.ClientType;
import trapx00.lightx00.client.vo.salestaff.ClientVo;
import trapx00.lightx00.client.vo.salestaff.SaleStaffVo;

public class ClientBlServiceStub implements ClientBlService{
    @Override
    public ClientVo[] query(String query) {
        ClientVo[] clientVos=new ClientVo[1];
        clientVos[0]=new ClientVo("0",
                ClientType.Retailer,
                1,
                "xiaoming",
                "12345678",
                "12345678",
                "210000",
                "12345679@qq.com",
                123,
                456,
                new SaleStaffVo(null,null,null,null,null));
        return clientVos;
    }

    @Override
    public ResultMessage saveAsDraft(ClientVo client) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage modify(ClientVo client) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage add(ClientVo client) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage delete(ClientVo[] client) {
        return ResultMessage.Success;
    }

    @Override
    public ClientVo detail(ClientVo client) {
        ClientVo clientVo=new ClientVo("0",
                ClientType.Retailer,
                1,
                "xiaoming",
                "12345678",
                "12345678",
                "210000",
                "12345679@qq.com",
                123,
                456,
                new SaleStaffVo(null,null,null,null,null));
        return clientVo;
    }
}
