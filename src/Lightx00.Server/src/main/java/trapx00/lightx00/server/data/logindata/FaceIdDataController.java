package trapx00.lightx00.server.data.logindata;

import com.j256.ormlite.dao.Dao;
import trapx00.lightx00.server.data.faceid.FaceIdAuthenticationService;
import trapx00.lightx00.server.data.faceid.factory.FaceIdAuthenticationServiceFactory;
import trapx00.lightx00.server.data.faceid.factory.FaceIdDaoFactory;
import trapx00.lightx00.server.data.logindata.factory.LoginDataDaoFactory;
import trapx00.lightx00.shared.dataservice.logindataservice.FaceIdAuthenticationDataService;
import trapx00.lightx00.shared.po.employee.EmployeeFaceIdInfo;
import trapx00.lightx00.shared.po.employee.EmployeePo;

import java.rmi.RemoteException;
import java.rmi.server.RMISocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;

public class FaceIdDataController extends UnicastRemoteObject implements FaceIdAuthenticationDataService {
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
    public FaceIdDataController() throws RemoteException {
    }

    private FaceIdAuthenticationService service = FaceIdAuthenticationServiceFactory.getService();
    private Dao<EmployeePo, String> employeeDao = LoginDataDaoFactory.getDao();
    private Dao<EmployeeFaceIdInfo, Integer> faceIdInfoDao = FaceIdDaoFactory.getDao();

    /**
     * Authenticate with image.
     *
     * @param image image in binary
     * @return registered employee id if login is successful. null otherwise
     */
    @Override
    public EmployeePo authenticate(byte[] image) {
        String employeeId = service.authenticate(image);
        if (employeeId != null) {
            try {
                return employeeDao.queryForId(employeeId);
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            return null;
        }
    }
}
