package trapx00.lightx00.server.data.clientdata;

import com.j256.ormlite.dao.Dao;
import trapx00.lightx00.server.data.clientdata.factory.ClientDataDaoFactory;
import trapx00.lightx00.shared.dataservice.clientdataservice.ClientDataService;
import trapx00.lightx00.shared.exception.database.DbSqlException;
import trapx00.lightx00.shared.exception.database.IdExistsException;
import trapx00.lightx00.shared.exception.database.IdNotExistsException;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.client.ClientPo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;

public class ClientDataController extends UnicastRemoteObject implements ClientDataService {
    private Dao<ClientPo, String> clientDao = ClientDataDaoFactory.getClientDao();

    /**
     * @throws RemoteException
     */
    public ClientDataController() throws RemoteException {
        super();
    }

    private ClientPo assertIdExistence(String id, boolean assertExists) {
        try {
            ClientPo clientPo = clientDao.queryForId(id);
            boolean actualExistence = clientPo != null;
            if (actualExistence && !assertExists) {
                throw new IdExistsException(id);
            }
            if (!actualExistence && assertExists) {
                throw new IdNotExistsException(id);
            }
            return clientPo;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbSqlException(e);
        }
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
        try {
            clientDao.createIfNotExists(client);
            return ResultMessage.Success;
        } catch (SQLException e) {
            e.printStackTrace();
            return ResultMessage.Failure;
        }
    }

    /**
     * delete some clients
     *
     * @param ids of the client to be deleted
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(String[] ids) {
        try {
            for (String id : ids) {
                ClientPo clientPo = assertIdExistence(id, true);
                clientDao.delete(clientPo);
            }
            return ResultMessage.Success;
        } catch (SQLException e) {
            e.printStackTrace();
            return ResultMessage.Failure;
        }
    }
}