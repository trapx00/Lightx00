package trapx00.lightx00.shared.dataservice.logindataservice;

import trapx00.lightx00.shared.po.employee.EmployeePo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface FaceIdAuthenticationDataService extends Remote {
    /**
     * Login with face image.
     * @param faceImage face image in binary
     * @return id if login is successful. null otherwise
     */
    String authenticate(byte[] faceImage) throws RemoteException;
}
