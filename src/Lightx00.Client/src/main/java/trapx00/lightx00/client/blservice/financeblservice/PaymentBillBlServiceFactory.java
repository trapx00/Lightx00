package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.client.bl.financebl.PaymentBillBlController;
import trapx00.lightx00.client.blservice.financeblservice.PaymentBillBlService;

public class PaymentBillBlServiceFactory {

    private static PaymentBillBlController instance = new PaymentBillBlController();

    public static PaymentBillBlService getInstance() {
        return instance;
    }

}
