package trapx00.lightx00.server.data.clientdata;

import trapx00.lightx00.shared.dataservice.clientdataservice.ClientDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.client.ClientPo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ClientDataController extends UnicastRemoteObject implements ClientDataService {

    /**
     *
     * @throws RemoteException
     */
    public ClientDataController() throws RemoteException {
        super();
    }

    /**
     * Query clients which includes the words
     *
     * @param query condition
     * @return the clients which corresponds to the query
     */
    @Override
    public ClientPo[] query(String query) {
        return new ClientPo[0];
    }

    /**
     * modify a client
     *
     * @param client to be modified
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(ClientPo client) {
        return null;
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

    /**
     * add a client
     *
     * @param client to be added
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(ClientPo client) {
        return null;
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
