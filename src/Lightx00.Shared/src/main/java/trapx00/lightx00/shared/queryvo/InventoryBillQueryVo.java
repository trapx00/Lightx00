package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillPo;

import java.util.function.Predicate;

public class InventoryBillQueryVo extends  BaseQueryVo<InventoryBillPo,String> {
    /**
     * Instantiate a QueryVo with prepration method.
     *
     * @param preparation QueryBuilderPreparation method
     */
    public InventoryBillQueryVo(QueryBuilderPreparation<InventoryBillPo, String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public InventoryBillQueryVo() {
        super();
    }
}
