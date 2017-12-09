package trapx00.lightx00.server;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import trapx00.lightx00.server.data.admindata.factory.FaceIdRegistrationDataFactory;
import trapx00.lightx00.server.data.bankaccountdata.factory.BankAccountDataFactory;
import trapx00.lightx00.server.data.clientdata.factory.ClientDataFactory;
import trapx00.lightx00.server.data.commoditydata.factory.CommodityDataFactory;
import trapx00.lightx00.server.data.financedata.factory.CashBillDataFactory;
import trapx00.lightx00.server.data.inventorydata.factory.InventoryGiftDataFactory;
import trapx00.lightx00.server.data.inventorydata.factory.PurchaseBillDataFactory;
import trapx00.lightx00.server.data.inventorydata.factory.PurchaseRefundBillDataFactory;
import trapx00.lightx00.server.data.logindata.factory.FaceIdAuthenticationDataFactory;
import trapx00.lightx00.server.data.logindata.factory.LoginDataFactory;
import trapx00.lightx00.server.data.notificationdata.factory.NotificationDataFactory;
import trapx00.lightx00.server.data.saledata.factory.SaleBillDataFactory;
import trapx00.lightx00.server.data.saledata.factory.SaleRefundBillDataFactory;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.server.data.util.serverlogservice.ServerLogService;
import trapx00.lightx00.server.data.util.serverlogservice.factory.ServerLogServiceFactory;
import trapx00.lightx00.shared.dataservice.admindataservice.FaceIdRegistrationDataService;
import trapx00.lightx00.shared.dataservice.bankaccountdataservice.BankAccountDataService;
import trapx00.lightx00.shared.dataservice.clientdataservice.ClientDataService;
import trapx00.lightx00.shared.dataservice.commoditydataservice.CommodityDataService;
import trapx00.lightx00.shared.dataservice.financedataservice.CashBillDataService;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryGiftDataService;
import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseBillDataService;
import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseRefundBillDataService;
import trapx00.lightx00.shared.dataservice.logindataservice.FaceIdAuthenticationDataService;
import trapx00.lightx00.shared.dataservice.logindataservice.LoginDataService;
import trapx00.lightx00.shared.dataservice.notificationdataservice.NotificationDataService;
import trapx00.lightx00.shared.dataservice.saledataservice.SaleBillDataService;
import trapx00.lightx00.shared.dataservice.saledataservice.SaleRefundBillDataService;
import trapx00.lightx00.shared.queryvo.BankAccountQueryVo;
import trapx00.lightx00.shared.util.RmiHelper;

import javax.management.Notification;
import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.sql.SQLException;
import java.util.Arrays;


public class Server {

    public static ServerLogService logService = ServerLogServiceFactory.getService();
    public static final String caller = "Main function";
    /**
     * Server runner
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        initRmi();
    }

    public static void initRmi() {
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
            CashBillDataService cashBillDataService = CashBillDataFactory.getService();
            NotificationDataService notificationDataService = NotificationDataFactory.getService();
            BankAccountDataService bankAccountDataService = BankAccountDataFactory.getService();
            LocateRegistry.createRegistry(Integer.parseInt(RmiHelper.getPort()));
            CommodityDataService commodityDataService= CommodityDataFactory.getController();
            InventoryGiftDataService inventoryGiftDataService= InventoryGiftDataFactory.getService();
            export(inventoryGiftDataService);
            export(commodityDataService);
            export(saleBillDataService);
            export(saleRefundBillDataService);
            export(purchaseBillDataService);
            export(purchaseRefundBillDataService);
            export(clientDataService);
            export(faceIdRegistrationDataService);
            export(faceIdAuthenticationDataService);
            export(loginDataService);
            export(cashBillDataService);
            export(notificationDataService);
            export(bankAccountDataService);
            logService.printLog(caller, "Initialization done.");

        } catch (RemoteException | MalformedURLException | AlreadyBoundException | SQLException e) {
            logService.printLog(caller, String.format("%s occurred. Message: %s", e.getClass().toString(), e.getMessage()));
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
            logService.printLog(caller, String.format("registered %s to %s", url, remoteObj.toString()));
            Naming.rebind(url, remoteObj);
        }

    }

}

