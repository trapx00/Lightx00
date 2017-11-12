package trapx00.lightx00.server;

import trapx00.lightx00.server.data.clientdata.ClientDataController;
import trapx00.lightx00.server.data.inventorydata.PurchaseBillDataController;
import trapx00.lightx00.server.data.inventorydata.PurchaseRefundBillDataController;
import trapx00.lightx00.server.data.saledata.SaleBillDataController;
import trapx00.lightx00.server.data.saledata.SaleRefundBillDataController;
import trapx00.lightx00.shared.dataservice.clientdataservice.ClientDataService;
import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseBillDataService;
import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseRefundBillDataService;
import trapx00.lightx00.shared.dataservice.saledataservice.SaleBillDataService;
import trapx00.lightx00.shared.dataservice.saledataservice.SaleRefundBillDataService;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {

    /**
     * Server runner
     * @param args command line args
     */
    public static void main(String[] args) {
        try {
            SaleBillDataService saleBillDataService = new SaleBillDataController();
            SaleRefundBillDataService saleRefundBillDataService = new SaleRefundBillDataController();
            PurchaseBillDataService purchaseBillDataService = new PurchaseBillDataController();
            PurchaseRefundBillDataService purchaseRefundBillDataService = new PurchaseRefundBillDataController();
            ClientDataService clientDataService = new ClientDataController();

            LocateRegistry.createRegistry(8888);
            Naming.bind("rmi://localhost:8888/SaleBillDataService", saleBillDataService);
            Naming.bind("rmi://localhost:8888/SaleRefundBillDataService", saleRefundBillDataService);
            Naming.bind("rmi://localhost:8888/PurchaseBillDataService", purchaseBillDataService);
            Naming.bind("rmi://localhost:8888/PurchaseRefundBillDataService", purchaseRefundBillDataService);
            Naming.bind("rmi://localhost:8888/ClientDataService", clientDataService);
            System.out.println(">>>>>INFO:远程对象绑定成功！");
        } catch (RemoteException e) {
            System.out.println("创建远程对象发生异常！");
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            System.out.println("发生重复绑定对象异常！");
            e.printStackTrace();
        } catch (MalformedURLException e) {
            System.out.println("发生URL畸形异常！");
            e.printStackTrace();
        }
    }
}
