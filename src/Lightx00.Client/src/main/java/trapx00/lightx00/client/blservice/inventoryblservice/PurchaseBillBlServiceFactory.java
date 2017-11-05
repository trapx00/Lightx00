package trapx00.lightx00.client.blservice.inventoryblservice;

import trapx00.lightx00.client.bl.inventorybl.PurchaseBillBlController;

public class PurchaseBillBlServiceFactory {
    PurchaseBillBlService purchaseBillBlService=new PurchaseBillBlController();

    public PurchaseBillBlService getInstance(){
        return purchaseBillBlService;
    }
}
