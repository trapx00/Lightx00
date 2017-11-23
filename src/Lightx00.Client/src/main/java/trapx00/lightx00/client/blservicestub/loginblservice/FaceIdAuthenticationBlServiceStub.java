package trapx00.lightx00.client.blservicestub.loginblservice;

import trapx00.lightx00.shared.dataservice.logindataservice.FaceIdAuthenticationDataService;
import trapx00.lightx00.shared.po.employee.EmployeePo;

import java.rmi.RemoteException;

public class FaceIdAuthenticationBlServiceStub implements FaceIdAuthenticationDataService {
    /**
     * Login with face image.
     *
     * @param faceImage face image in binary
     * @return EmployeePo if login is successful. null otherwise
     */
    @Override
    public EmployeePo authenticate(byte[] faceImage) throws RemoteException {
        return null;
    }
}
