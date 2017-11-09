package trapx00.lightx00.client.blservice.inventoryblservice;

import trapx00.lightx00.client.bl.inventorybl.PurchaseRefundBillBlController;

public class PurchaseRefundBillBlServiceFactory {
    PurchaseRefundBillBlService purchaseRefundBillBlService=new PurchaseRefundBillBlController();

    public PurchaseRefundBillBlService getInstance(){
        return purchaseRefundBillBlService;
    }
}
