package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.inventorystaff.InventoryBillPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryViewPo;

public class InventoryViewQueryVo extends BaseQueryVo<InventoryViewPo,String> {
    /**
     * Instantiate a QueryVo with prepration method.
     *
     * @param preparation QueryBuilderPreparation method
     */
    public InventoryViewQueryVo(QueryBuilderPreparation<InventoryViewPo, String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public InventoryViewQueryVo() {
        super();
    }
}
