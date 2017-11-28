package trapx00.lightx00.client.bl.inventorybl;


import trapx00.lightx00.client.vo.inventorystaff.InventoryBillVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryGiftVo;
import trapx00.lightx00.shared.queryvo.InventoryBillQueryVo;
import trapx00.lightx00.shared.queryvo.InventoryGiftQueryVo;

public interface InventoryBillService {
    /**
     * Querys inventoryBill(Loss,Warning...)
     * @param inventoryBillQueryVo
     * @return  the list of inventoryBIlls that match to the requirement
     */
    InventoryBillVo[] queryInventoryBill(InventoryBillQueryVo inventoryBillQueryVo);

    /**
     * Querys inventoryGift
     * @param inventoryBillQueryVo
     * @return  the list of inventoryBIlls that match to the requirement
     */
    InventoryGiftVo[] queryInventoryGift (InventoryGiftQueryVo inventoryBillQueryVo);

}
