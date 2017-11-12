package trapx00.lightx00.client.vo.inventorystaff;

import trapx00.lightx00.shared.po.inventorystaff.InventoryBillType;

public class InventoryBillQueryVo {
    private String id;
    private InventoryBillType inventoryBillType;

    public InventoryBillQueryVo(String id,InventoryBillType inventoryBillType){
        this.id=id;
        this.inventoryBillType=inventoryBillType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InventoryBillType getInventoryBillType() {
        return inventoryBillType;
    }

    public void setInventoryBillType(InventoryBillType inventoryBillType) {
        this.inventoryBillType = inventoryBillType;
    }
}
