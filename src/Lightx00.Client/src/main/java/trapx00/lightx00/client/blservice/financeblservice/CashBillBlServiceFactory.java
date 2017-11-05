package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.client.bl.financebl.CashBillBlController;
import trapx00.lightx00.client.blservice.financeblservice.CashBillBlService;

public class CashBillBlServiceFactory {
    private static CashBillBlService instance = new CashBillBlController();
    public static CashBillBlService getInstance() {
        return instance;
    }
}
