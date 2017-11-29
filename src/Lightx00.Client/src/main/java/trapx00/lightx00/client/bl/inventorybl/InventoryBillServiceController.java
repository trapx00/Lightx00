package trapx00.lightx00.client.bl.inventorybl;

import trapx00.lightx00.client.blservice.inventoryblservice.InventoryGiftBlService;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryWarningBlService;
import trapx00.lightx00.client.vo.inventorystaff.InventoryBillVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryGiftVo;
import trapx00.lightx00.shared.queryvo.InventoryBillQueryVo;
import trapx00.lightx00.shared.queryvo.InventoryGiftQueryVo;

public class InventoryBillServiceController implements InventoryBillService {
   private InventoryWarningBlService inventoryWarningBlService = new InventoryWarningBlController();
   private InventoryGiftBlService inventoryGiftBlService = new InventoryGiftBlController();

    @Override
    public InventoryBillVo[] queryInventoryBill(InventoryBillQueryVo inventoryBillQueryVo) {
        return inventoryWarningBlService.query(inventoryBillQueryVo);
    }

    @Override
    public InventoryGiftVo[] queryInventoryGift(InventoryGiftQueryVo inventoryGiftQueryVo) {
        return inventoryGiftBlService.query(inventoryGiftQueryVo);
    }
}
