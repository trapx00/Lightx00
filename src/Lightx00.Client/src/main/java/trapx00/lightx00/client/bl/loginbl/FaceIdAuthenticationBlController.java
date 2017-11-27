package trapx00.lightx00.client.bl.loginbl;

import trapx00.lightx00.client.bl.adminbl.EmployeeInfo;
import trapx00.lightx00.client.bl.adminbl.factory.EmployeeInfoFactory;
import trapx00.lightx00.client.blservice.loginblservice.FaceIdAuthenticationBlService;
import trapx00.lightx00.client.datafactory.logindataservicefactory.FaceIdAuthenticationDataServiceFactory;
import trapx00.lightx00.client.vo.EmployeeVo;
import trapx00.lightx00.shared.dataservice.logindataservice.FaceIdAuthenticationDataService;

import java.rmi.RemoteException;

public class FaceIdAuthenticationBlController implements FaceIdAuthenticationBlService {
    private FaceIdAuthenticationDataService dataService = FaceIdAuthenticationDataServiceFactory.getService();
    private EmployeeInfo employeeInfo = EmployeeInfoFactory.getEmployeeInfo();
    /**
     * Login with image.
     *
     * @param bytes image in bytes
     * @return EmployeeVo if authenticated. null otherwise.
     */
    @Override
    public EmployeeVo authenticate(byte[] bytes) {
        try {
            String employeeId =  dataService.authenticate(bytes);
            if (employeeId == null) {
                return null;
            }
            return employeeInfo.queryById(employeeId);
        } catch (RemoteException e) {
            e.printStackTrace();
            return null;
        }
    }
}
