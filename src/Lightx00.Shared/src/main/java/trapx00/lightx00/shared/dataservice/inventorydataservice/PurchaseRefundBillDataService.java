package trapx00.lightx00.shared.dataservice.inventorydataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.salestaff.PurchaseRefundBillPo;

public interface  PurchaseRefundBillDataService {

    /**
     * submit a purchaseRefundBill
     * @param purchaseRefundBill to be submitted
     * @return whether the operation is done successfully
     */
    ResultMessage submit(PurchaseRefundBillPo purchaseRefundBill);//提交进货退货单

}