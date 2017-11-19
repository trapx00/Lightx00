package trapx00.lightx00.server;

import com.j256.ormlite.dao.Dao;
import trapx00.lightx00.server.data.financedata.factory.FinanceDataDaoFactory;
import trapx00.lightx00.server.data.logdata.factory.LogDataDaoFactory;
import trapx00.lightx00.server.data.util.db.BaseDatabaseFactory;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.financestaff.CashBillItem;
import trapx00.lightx00.shared.po.financestaff.CashBillPo;
import trapx00.lightx00.shared.po.log.LogPo;
import trapx00.lightx00.shared.po.log.LogSeverity;

import java.util.Date;
import java.sql.SQLException;

public class Server {

    /**
     * Server runner
     *
     * @param args command line args
     */
    public static void main(String[] args) {
//        try {
//            SaleBillDataService saleBillDataService = SaleBillDataFactory.getService();
//            SaleRefundBillDataService saleRefundBillDataService = SaleRefundBillDataFactory.getService();
//            PurchaseBillDataService purchaseBillDataService = PurchaseBillDataFactory.getService();
//            PurchaseRefundBillDataService purchaseRefundBillDataService = PurchaseRefundBillDataFactory.getService();
//            ClientDataService clientDataService = ClientDataFactory.getService();
//
//            LocateRegistry.createRegistry(8888);
//            Naming.bind(RmiHelper.generateRmiUrl(SaleBillDataService.class), saleBillDataService);
//            Naming.bind(RmiHelper.generateRmiUrl(SaleRefundBillDataService.class), saleRefundBillDataService);
//            Naming.bind(RmiHelper.generateRmiUrl(PurchaseBillDataService.class), purchaseBillDataService);
//            Naming.bind(RmiHelper.generateRmiUrl(PurchaseRefundBillDataService.class), purchaseRefundBillDataService);
//            Naming.bind(RmiHelper.generateRmiUrl(ClientDataService.class), clientDataService);
//            System.out.println(">>>>>INFO:远程对象绑定成功！");
//        } catch (RemoteException e) {
//            System.out.println("创建远程对象发生异常！");
//            e.printStackTrace();
//        } catch (AlreadyBoundException e) {
//            System.out.println("发生重复绑定对象异常！");
//            e.printStackTrace();
//        } catch (MalformedURLException e) {
//            System.out.println("发生URL畸形异常！");
//            e.printStackTrace();
//        }
        try {
            BaseDatabaseFactory.init();
            Dao<LogPo, Integer> log = LogDataDaoFactory.getLogDao();
            log.create(new LogPo(new Date(), LogSeverity.Success,"123"));
            Dao<CashBillPo, String> cashBillDao = FinanceDataDaoFactory.getCashBillDao();
//            cashBillDao.create(new CashBillPo("123",new Date(), BillState.Rejected,"123","123",new CashBillItem[] { new CashBillItem("123",0,"123")}));
            System.out.println(cashBillDao.queryForAll().get(0).getItems()[0].getAmount());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
