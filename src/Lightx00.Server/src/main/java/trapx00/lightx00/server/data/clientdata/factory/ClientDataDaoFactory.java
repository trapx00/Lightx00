package trapx00.lightx00.server.data.clientdata.factory;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.client.ClientPo;

import java.sql.SQLException;

public class ClientDataDaoFactory extends BaseDatabaseFactory {
    private static Dao<ClientPo, String> clientDao;

    static {
        initTable(ClientPo.class);
    }

    public static Dao<ClientPo, String> getClientDao() {
        if (clientDao == null) {
            try {
                return clientDao = DaoManager.createDao(connectionSource, ClientPo.class);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return clientDao;
    }
}
