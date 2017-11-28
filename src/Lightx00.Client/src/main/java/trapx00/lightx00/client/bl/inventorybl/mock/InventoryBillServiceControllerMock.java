package trapx00.lightx00.client.bl.inventorybl.mock;

import trapx00.lightx00.client.bl.inventorybl.InventoryBillServiceController;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryGiftBlService;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryWarningBlService;
import trapx00.lightx00.client.vo.inventorystaff.InventoryBillVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryGiftVo;
import trapx00.lightx00.shared.queryvo.InventoryBillQueryVo;

public class InventoryBillServiceControllerMock extends InventoryBillServiceController {
    InventoryWarningBlService inventoryWarningBlService=new InventoryWarningBlControllerMock();
    InventoryGiftBlService inventoryGiftBlService=new InventoryGiftBlControllerMock();

    /**
     * query for PurchaseBills
     *
     * @param inventoryBillQueryVo function
     * @return array of PurchaseBillVo
     */
    @Override
    public InventoryBillVo[] queryInventoryBill(InventoryBillQueryVo inventoryBillQueryVo) {
        return inventoryWarningBlService.query(inventoryBillQueryVo);
    }



    /**
     * query for PurchaseRefundBills
     *
     * @param inventoryBillQueryVo function
     * @return array of PurchaseRefundBillVo
     */
    @Override
    public InventoryGiftVo[] queryInventoryGift(InventoryBillQueryVo inventoryBillQueryVo) {
        return inventoryGiftBlService.query(inventoryBillQueryVo);
    }
}
