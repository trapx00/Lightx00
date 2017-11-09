package trapx00.lightx00.shared.dataservice.clientdataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.client.ClientPo;

public interface  ClientDataService {

    /**
     * Query clients which includes the words
     * @param query condition
     * @return the clients which corresponds to the query
     */
    public ClientPo[] query(String query);//查询客户

    /**
     * modify a client
     * @param client to be modified
     * @return whether the operation is done successfully
     */
    public ResultMessage modify(ClientPo client);//修改客户信息

    /**
     * Gets the id for the next client
     *
     * @return id for the next client
     */
    public String getId();//获得新客户的ID

    /**
     * add a client
     * @param client to be added
     * @return whether the operation is done successfully
     */
    public ResultMessage add(ClientPo client);//增加客户

    /**
     * delete some clients
     * @param id of the client to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(String[] id);//删除客户
}