package trapx00.lightx00.client.bl.inventorybl;

import trapx00.lightx00.shared.vo.salestaff.PurchaseBillQueryVo;
import trapx00.lightx00.shared.vo.salestaff.PurchaseBillVo;
import trapx00.lightx00.shared.vo.salestaff.PurchaseRefundBillVo;

public interface PurchaseBillBlInfo {

    /**
     * query for PurchaseBills
     * @param query function
     * @return array of PurchaseBillVo
     */
    PurchaseBillVo[] queryPurchaseBillVo(PurchaseBillQueryVo query);

    /**
     * query for PurchaseRefundBills
     * @param query function
     * @return array of PurchaseRefundBillVo
     */
    PurchaseRefundBillVo[] queryPurchaseRefundBillVo(PurchaseRefundBillVo query);
}
