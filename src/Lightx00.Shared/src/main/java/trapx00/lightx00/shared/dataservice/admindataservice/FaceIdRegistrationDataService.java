package trapx00.lightx00.shared.dataservice.admindataservice;

import trapx00.lightx00.shared.po.ResultMessage;

import java.rmi.Remote;

public interface FaceIdRegistrationDataService extends Remote {
    /**
     * Registers a picture with a Employee id.
     * @param employeeId employee id
     * @param image image in binary
     * @return whether the registration is done successfully
     */
    ResultMessage register(String employeeId, byte[] image);

    /**
     * Unregisters a employeeId.
     * @param employeeId employee id
     * @return whether the unregistration is done successfully
     */
    ResultMessage unregister(String employeeId);
}
