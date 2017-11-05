package trapx00.lightx00.client.bl.inventorybl;

import trapx00.lightx00.client.blservice.inventoryblservice.PurchaseBillBlService;
import trapx00.lightx00.client.blservice.inventoryblservice.PurchaseRefundBillBlService;
import trapx00.lightx00.shared.vo.salestaff.PurchaseBillQueryVo;
import trapx00.lightx00.shared.vo.salestaff.PurchaseBillVo;
import trapx00.lightx00.shared.vo.salestaff.PurchaseRefundBillVo;

public class PurchaseBillBlInfoController implements PurchaseBillBlInfo {
    PurchaseBillBlService purchaseBillBlService=new PurchaseBillBlController();
    PurchaseRefundBillBlService purchaseRefundBillBlService=new PurchaseRefundBillBlController();

    /**
     * query for PurchaseBills
     *
     * @param query function
     * @return array of PurchaseBillVo
     */
    @Override
    public PurchaseBillVo[] queryPurchaseBillVo(PurchaseBillQueryVo query) {
        return purchaseBillBlService.queryPurchaseBillVo(query);
    }

    /**
     * query for PurchaseRefundBills
     *
     * @param query function
     * @return array of PurchaseRefundBillVo
     */
    @Override
    public PurchaseRefundBillVo[] queryPurchaseRefundBillVo(PurchaseRefundBillVo query) {
        return purchaseRefundBillBlService.queryPurchaseRefundBillVo(query);
    }
}
