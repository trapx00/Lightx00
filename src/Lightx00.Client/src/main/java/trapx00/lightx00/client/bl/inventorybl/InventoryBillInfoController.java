package trapx00.lightx00.client.bl.inventorybl;

import trapx00.lightx00.client.blservice.inventoryblservice.InventoryGiftBlService;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryWarningBlService;
import trapx00.lightx00.client.vo.inventorystaff.InventoryDetailBillVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryGiftVo;
import trapx00.lightx00.shared.queryvo.InventoryBillQueryVo;
import trapx00.lightx00.shared.queryvo.InventoryGiftQueryVo;

public class InventoryBillInfoController implements InventoryBillInfo {
   private InventoryWarningBlService inventoryWarningBlService = new InventoryWarningBlController();
   private InventoryGiftBlService inventoryGiftBlService = new InventoryGiftBlController();

    @Override
    public InventoryDetailBillVo[] queryInventoryBill(InventoryBillQueryVo inventoryBillQueryVo) {
        return inventoryWarningBlService.query(inventoryBillQueryVo);
    }

    @Override
    public InventoryGiftVo[] queryInventoryGift(InventoryGiftQueryVo inventoryGiftQueryVo) {
        return inventoryGiftBlService.query(inventoryGiftQueryVo);
    }
}
