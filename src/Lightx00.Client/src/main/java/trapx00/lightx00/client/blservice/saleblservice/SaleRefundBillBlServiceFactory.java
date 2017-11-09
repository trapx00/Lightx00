package trapx00.lightx00.client.blservice.saleblservice;

import trapx00.lightx00.client.bl.salebl.SaleRefundBillBlController;

public class SaleRefundBillBlServiceFactory {
        SaleRefundBillBlService saleRefundBillBlService=new SaleRefundBillBlController();

    public SaleRefundBillBlService getInstance() {
        return saleRefundBillBlService;
    }
}
