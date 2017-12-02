package trapx00.lightx00.client.bl.inventorybl.mock;

import trapx00.lightx00.client.blservice.inventoryblservice.InventoryGiftBlService;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryWarningBlService;
import trapx00.lightx00.client.vo.inventorystaff.InventoryDetailBillVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryGiftVo;
import trapx00.lightx00.shared.queryvo.InventoryBillQueryVo;
import trapx00.lightx00.shared.queryvo.InventoryGiftQueryVo;

public class InventoryBillInfoControllerMock extends InventoryBillInfoController {
    InventoryWarningBlService inventoryWarningBlService=new InventoryWarningBlControllerMock();
    InventoryGiftBlService inventoryGiftBlService=new InventoryGiftBlControllerMock();

    /**
     * query for PurchaseBills
     *
     * @param inventoryBillQueryVo function
     * @return array of PurchaseBillVo
     */
    @Override
    public InventoryDetailBillVo[] queryInventoryBill(InventoryBillQueryVo inventoryBillQueryVo) {
        return inventoryWarningBlService.query(inventoryBillQueryVo);
    }



    /**
     * query for PurchaseRefundBills
     *
     * @param inventoryBillQueryVo function
     * @return array of PurchaseRefundBillVo
     */
    @Override
    public InventoryGiftVo[] queryInventoryGift(InventoryGiftQueryVo inventoryBillQueryVo) {
        return inventoryGiftBlService.query(inventoryBillQueryVo);
    }
}
