package trapx00.lightx00.shared.dataservice.clientdataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.client.ClientPo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface  ClientDataService extends Remote {

    /**
     * Query clients which includes the words
     * @param query condition
     * @return the clients which corresponds to the query
     */
    public ClientPo[] query(String query) throws RemoteException;//查询客户

    /**
     * modify a client
     * @param client to be modified
     * @return whether the operation is done successfully
     */
    public ResultMessage modify(ClientPo client) throws RemoteException;//修改客户信息

    /**
     * Gets the id for the next client
     *
     * @return id for the next client
     */
    public String getId() throws RemoteException;//获得新客户的ID

    /**
     * add a client
     * @param client to be added
     * @return whether the operation is done successfully
     */
    public ResultMessage add(ClientPo client) throws RemoteException;//增加客户

    /**
     * delete some clients
     * @param id of the client to be deleted
     * @return whether the operation is done successfully
     */
    public ResultMessage delete(String[] id) throws RemoteException;//删除客户
}