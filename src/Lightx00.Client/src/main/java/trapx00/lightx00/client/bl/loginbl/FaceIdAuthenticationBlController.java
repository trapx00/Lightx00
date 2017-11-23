package trapx00.lightx00.client.bl.loginbl;

import trapx00.lightx00.client.blservice.loginblservice.FaceIdAuthenticationBlService;
import trapx00.lightx00.client.datafactory.logindataservicefactory.FaceIdAuthenticationDataServiceFactory;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.shared.dataservice.logindataservice.FaceIdAuthenticationDataService;
import trapx00.lightx00.shared.dataservicestub.logindataservice.FaceIdAuthenticationDataServiceStub;
import trapx00.lightx00.shared.po.employee.EmployeePo;

import java.rmi.RemoteException;

public class FaceIdAuthenticationBlController implements FaceIdAuthenticationBlService {
    private FaceIdAuthenticationDataService dataService = FaceIdAuthenticationDataServiceFactory.getService();
    /**
     * Login with image.
     *
     * @param bytes image in bytes
     * @return EmployeeVo if authenticated. null otherwise.
     */
    @Override
    public EmployeeVo authenticate(byte[] bytes) {
        try {
            EmployeePo employeePo =  dataService.authenticate(bytes);
            if (employeePo == null) {
                return null;
            }

        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
