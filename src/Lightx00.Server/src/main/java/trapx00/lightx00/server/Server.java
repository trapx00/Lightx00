package trapx00.lightx00.server;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.PreparedQuery;
import trapx00.lightx00.server.data.admindata.factory.AdminDataDaoFactory;
import trapx00.lightx00.server.data.admindata.factory.FaceIdRegistrationDataFactory;
import trapx00.lightx00.server.data.clientdata.factory.ClientDataFactory;
import trapx00.lightx00.server.data.financedata.factory.FinanceDataDaoFactory;
import trapx00.lightx00.server.data.inventorydata.factory.PurchaseBillDataFactory;
import trapx00.lightx00.server.data.inventorydata.factory.PurchaseRefundBillDataFactory;
import trapx00.lightx00.server.data.logdata.factory.LogDataDaoFactory;
import trapx00.lightx00.server.data.logindata.factory.FaceIdAuthenticationDataFactory;
import trapx00.lightx00.server.data.logindata.factory.LoginDataFactory;
import trapx00.lightx00.server.data.saledata.factory.SaleBillDataFactory;
import trapx00.lightx00.server.data.saledata.factory.SaleRefundBillDataFactory;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.server.data.util.serverlogservice.ServerLogService;
import trapx00.lightx00.server.data.util.serverlogservice.factory.ServerLogServiceFactory;
import trapx00.lightx00.shared.dataservice.admindataservice.FaceIdRegistrationDataService;
import trapx00.lightx00.shared.dataservice.clientdataservice.ClientDataService;
import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseBillDataService;
import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseRefundBillDataService;
import trapx00.lightx00.shared.dataservice.logindataservice.FaceIdAuthenticationDataService;
import trapx00.lightx00.shared.dataservice.logindataservice.LoginDataService;
import trapx00.lightx00.shared.dataservice.saledataservice.SaleBillDataService;
import trapx00.lightx00.shared.dataservice.saledataservice.SaleRefundBillDataService;
import trapx00.lightx00.shared.po.admin.AdminPo;
import trapx00.lightx00.shared.po.employee.EmployeeFaceIdInfo;
import trapx00.lightx00.shared.po.employee.EmployeePo;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;
import trapx00.lightx00.shared.po.financestaff.FinanceStaffPo;
import trapx00.lightx00.shared.po.log.LogPo;
import trapx00.lightx00.shared.po.log.LogSeverity;
import trapx00.lightx00.shared.queryvo.LogQueryVo;
import trapx00.lightx00.shared.util.RmiHelper;

import javax.print.attribute.standard.MediaSize;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Arrays;
import java.util.Date;
import java.sql.SQLException;
import java.util.List;

public class Server {

    public static ServerLogService logService = ServerLogServiceFactory.getService();
    /**
     * Server runner
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        try {
            BaseDatabaseFactory.init();
            SaleBillDataService saleBillDataService = SaleBillDataFactory.getService();
            SaleRefundBillDataService saleRefundBillDataService = SaleRefundBillDataFactory.getService();
            PurchaseBillDataService purchaseBillDataService = PurchaseBillDataFactory.getService();
            PurchaseRefundBillDataService purchaseRefundBillDataService = PurchaseRefundBillDataFactory.getService();
            ClientDataService clientDataService = ClientDataFactory.getService();
            FaceIdRegistrationDataService faceIdRegistrationDataService = FaceIdRegistrationDataFactory.getService();
            FaceIdAuthenticationDataService faceIdAuthenticationDataService = FaceIdAuthenticationDataFactory.getDataService();
            LoginDataService loginDataService = LoginDataFactory.getService();

            LocateRegistry.createRegistry(Integer.parseInt(RmiHelper.getPort()));
            export(saleBillDataService);
            export(saleRefundBillDataService);
            export(purchaseBillDataService);
            export(purchaseRefundBillDataService);
            export(clientDataService);
            export(faceIdRegistrationDataService);
            export(faceIdAuthenticationDataService);
            export(loginDataService);
            System.out.println(">>>>>INFO:远程对象绑定成功！");

            FinanceStaffPo employeePo = new FinanceStaffPo("123","1",new Date(), "123","123");
            Dao<FinanceStaffPo, String> dao = AdminDataDaoFactory.getFinanceStaffDao();
            Dao<AdminPo, String> adminDao = AdminDataDaoFactory.getAdminDao();
            AdminPo adminPo = new AdminPo("1234","2",new Date(), "123", "123");
            dao.deleteById("1");
            adminDao.deleteById("2");
            adminDao.create(adminPo);
            dao.create(employeePo);
        } catch (RemoteException e) {
            System.out.println("创建远程对象发生异常！");
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            System.out.println("发生重复绑定对象异常！");
            e.printStackTrace();
        } catch (MalformedURLException e) {
            System.out.println("发生URL畸形异常！");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public static void export(Remote remoteObj) throws RemoteException, MalformedURLException, AlreadyBoundException {
        Class[] implementedInterfaces = remoteObj.getClass().getInterfaces();
        Class remoteInterface = Arrays.stream(implementedInterfaces)
            .filter(Remote.class::isAssignableFrom)
            .findFirst()
            .orElse(null);
        if (remoteInterface != null) {
            String url = RmiHelper.generateRmiUrl(remoteInterface);
            logService.printLog("Main function", String.format("registered %s to %s", url, remoteObj.toString()));
            Naming.bind(url, remoteObj);
        }

    }

}
