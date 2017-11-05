package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.client.bl.financebl.ReceivalBillBlController;
import trapx00.lightx00.client.blservice.financeblservice.ReceivalBillBlService;

public class ReceivalBillBlServiceFactory {

    private static ReceivalBillBlController instance = new ReceivalBillBlController();

    public static ReceivalBillBlService getInstance() {
        return instance;
    }
}
