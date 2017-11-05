package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.client.bl.financebl.PaymentBillBlController;
import trapx00.lightx00.client.blservice.financeblservice.PaymentBillBlService;

public class PaymentBillBlServiceFactory {
    public static PaymentBillBlService getInstance() {
        return new PaymentBillBlController();
    }

}
