package trapx00.lightx00.server.data.logindata;

import com.j256.ormlite.dao.Dao;
import trapx00.lightx00.server.data.logindata.factory.LoginDataDaoFactory;
import trapx00.lightx00.shared.dataservice.logindataservice.LoginDataService;
import trapx00.lightx00.shared.exception.database.DbSqlException;
import trapx00.lightx00.shared.po.employee.EmployeePo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;

public class LoginDataController extends UnicastRemoteObject implements LoginDataService {
    /**
     * Creates and exports a new UnicastRemoteObject object using an
     * anonymous port.
     * <p>
     * <p>The object is exported with a server socket
     * created using the {@link RMISocketFactory} class.
     *
     * @throws RemoteException if failed to export object
     * @since JDK1.1
     */
    public LoginDataController() throws RemoteException {
    }

    private Dao<EmployeePo, String> dao = LoginDataDaoFactory.getDao();

    /**
     * Login.
     *
     * @param username username
     * @param password password
     * @return EmployeePo if login is successful
     */
    @Override
    public EmployeePo login(String username, String password) {
        try {
            EmployeePo employeePo = dao.queryBuilder().where().eq("username",username).queryForFirst();
            if (employeePo == null) {
                return null;
            }
            if (!employeePo.getPassword().equals(password)) {
                return null;
            }
            return employeePo;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DbSqlException(e);
        }
    }
}
