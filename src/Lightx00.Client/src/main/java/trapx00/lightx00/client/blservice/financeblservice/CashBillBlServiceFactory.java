package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.client.bl.financebl.CashBillBlController;
import trapx00.lightx00.client.blservice.financeblservice.CashBillBlService;

public class CashBillBlServiceFactory {
    public static CashBillBlService getInstance() {
        return new CashBillBlController();
    }
}
