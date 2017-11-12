package trapx00.lightx00.shared.dataservice.admindataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.queryvo.UserAccountQueryVo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface UserManagementDataService extends Remote {
    EmployeePo[] query(UserAccountQueryVo query) throws RemoteException;

    ResultMessage add(EmployeePo account) throws RemoteException;

    ResultMessage modify(EmployeePo account) throws RemoteException;

    ResultMessage delete(EmployeePo account) throws RemoteException;

}
