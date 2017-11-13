package trapx00.lightx00.server;

import trapx00.lightx00.server.data.clientdata.factory.ClientDataFactory;
import trapx00.lightx00.server.data.inventorydata.factory.PurchaseBillDataFactory;
import trapx00.lightx00.server.data.inventorydata.factory.PurchaseRefundBillDataFactory;
import trapx00.lightx00.server.data.saledata.factory.SaleBillDataFactory;
import trapx00.lightx00.server.data.saledata.factory.SaleRefundBillDataFactory;
import trapx00.lightx00.shared.dataservice.clientdataservice.ClientDataService;
import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseBillDataService;
import trapx00.lightx00.shared.dataservice.inventorydataservice.PurchaseRefundBillDataService;
import trapx00.lightx00.shared.dataservice.saledataservice.SaleBillDataService;
import trapx00.lightx00.shared.dataservice.saledataservice.SaleRefundBillDataService;
import trapx00.lightx00.shared.util.RmiHelper;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Server {

    /**
     * Server runner
     *
     * @param args command line args
     */
    public static void main(String[] args) {
        try {
            SaleBillDataService saleBillDataService = SaleBillDataFactory.getService();
            SaleRefundBillDataService saleRefundBillDataService = SaleRefundBillDataFactory.getService();
            PurchaseBillDataService purchaseBillDataService = PurchaseBillDataFactory.getService();
            PurchaseRefundBillDataService purchaseRefundBillDataService = PurchaseRefundBillDataFactory.getService();
            ClientDataService clientDataService = ClientDataFactory.getService();

            LocateRegistry.createRegistry(8888);
            Naming.bind(RmiHelper.generateRmiUrl(SaleBillDataService.class), saleBillDataService);
            Naming.bind(RmiHelper.generateRmiUrl(SaleRefundBillDataService.class), saleRefundBillDataService);
            Naming.bind(RmiHelper.generateRmiUrl(PurchaseBillDataService.class), purchaseBillDataService);
            Naming.bind(RmiHelper.generateRmiUrl(PurchaseRefundBillDataService.class), purchaseRefundBillDataService);
            Naming.bind(RmiHelper.generateRmiUrl(ClientDataService.class), clientDataService);
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
