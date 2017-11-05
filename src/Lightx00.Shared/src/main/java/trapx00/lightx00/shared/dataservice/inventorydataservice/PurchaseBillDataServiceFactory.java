package trapx00.lightx00.shared.dataservice.inventorydataservice;

import trapx00.lightx00.shared.data.inventorydata.PurchaseBillDataController;

public class PurchaseBillDataServiceFactory {
    PurchaseBillDataService purchaseBillDataService=new PurchaseBillDataController();

    public PurchaseBillDataService getInstance() {
        return purchaseBillDataService;
    }

}
