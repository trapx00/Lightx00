package trapx00.lightx00.client.bl.inventorybl;


import trapx00.lightx00.client.vo.inventorystaff.InventoryDetailBillVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryGiftVo;
import trapx00.lightx00.shared.queryvo.InventoryBillQueryVo;
import trapx00.lightx00.shared.queryvo.InventoryGiftQueryVo;

public interface InventoryBillInfo {
    /**
     * Querys inventoryBill(Loss,Warning...)
     * @param inventoryBillQueryVo
     * @return  the list of inventoryBIlls that match to the requirement
     */
    InventoryDetailBillVo[] queryInventoryBill(InventoryBillQueryVo inventoryBillQueryVo);

    /**
     * Querys inventoryGift
     * @param inventoryBillQueryVo
     * @return  the list of inventoryBIlls that match to the requirement
     */
    InventoryGiftVo[] queryInventoryGift (InventoryGiftQueryVo inventoryBillQueryVo);

}
