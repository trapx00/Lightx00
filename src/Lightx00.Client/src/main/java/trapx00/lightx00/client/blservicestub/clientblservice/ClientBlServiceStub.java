package trapx00.lightx00.client.blservicestub.clientblservice;

import trapx00.lightx00.client.blservice.clientblservice.ClientBlService;
import trapx00.lightx00.client.vo.salestaff.ClientVo;
import trapx00.lightx00.client.vo.salestaff.SaleStaffVo;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.client.ClientType;

public class ClientBlServiceStub implements ClientBlService {
    @Override
    public ClientVo[] query(String query) {
        ClientVo[] clientVos = new ClientVo[1];
        clientVos[0] = new ClientVo("0",
                ClientType.Retailer,
                1,
                "xiaoming",
                "12345678",
                "12345678",
                "210000",
                "12345679@qq.com",
                123,
                456,
                new SaleStaffVo(null, null, null, null, null,null));
        return clientVos;
    }

    /**
     * Query clients who has the id
     *
     * @param id id
     * @return the client with its id
     */
    @Override
    public ClientVo queryById(String id) {
        return null;
    }

    @Override
    public ResultMessage saveAsDraft(ClientVo client) {
        return ResultMessage.Success;
    }

    /**
     * Gets the id for the next client
     *
     * @return id for the next client
     */
    @Override
    public String getId() {
        return null;
    }

    @Override
    public ResultMessage modify(ClientVo client) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage add(ClientVo client) {
        return ResultMessage.Success;
    }

    /**
     * delete some clients
     *
     * @param id of the client to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(String[] id) {
        return null;
    }
}
