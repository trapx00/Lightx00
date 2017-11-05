package trapx00.lightx00.client.blservice.financeblservice;

import trapx00.lightx00.client.bl.financebl.SaleDetailBlController;

public class SaleDetailBlServiceFactory {
    private static SaleDetailBlService instance = new SaleDetailBlController();

    public static SaleDetailBlService getInstance() {
        return instance;
    }
}
