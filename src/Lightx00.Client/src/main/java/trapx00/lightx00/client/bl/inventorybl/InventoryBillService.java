package trapx00.lightx00.client.bl.inventorybl;

import trapx00.lightx00.shared.queryvo.InventoryBillQueryVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryBillVo;

public interface InventoryBillService {
    /**
     * Querys inventoryBill
     * @param inventoryBillQueryVo
     * @return  the list of inventoryBIlls that match to the requirement
     */
    InventoryBillVo[] queryInventoryBill(InventoryBillQueryVo inventoryBillQueryVo);
}
