package trapx00.lightx00.server.data.clientdata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.client.ClientPo;

import java.sql.SQLException;

public class ClientDataDaoFactory extends BaseDatabaseFactory {
    private static Dao<ClientPo, String> clientDao;

    public static Dao<ClientPo, String> getClientDao() {
        if (clientDao == null) {
            clientDao = createDao(ClientPo.class);
        }
        return clientDao;
    }
}
