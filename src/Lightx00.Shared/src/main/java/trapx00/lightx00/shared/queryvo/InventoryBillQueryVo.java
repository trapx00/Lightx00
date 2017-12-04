package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryDetailBillPo;

import java.util.function.Predicate;

public class InventoryBillQueryVo extends  BaseQueryVo<InventoryDetailBillPo,String, InventoryBillQueryVo> {
    public InventoryBillQueryVo(BaseQueryVo another) {
        super(another);
    }

    public InventoryBillQueryVo() {
    }
}
