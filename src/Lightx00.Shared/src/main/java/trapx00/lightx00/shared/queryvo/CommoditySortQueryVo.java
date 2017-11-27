package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.CommoditySortPo;

import java.util.function.Predicate;

public class CommoditySortQueryVo extends  BaseQueryVo<CommoditySortPo,String> {
    /**
     * Instantiate a QueryVo with prepration method.
     *
     * @param preparation QueryBuilderPreparation method
     */
    public CommoditySortQueryVo(QueryBuilderPreparation<CommoditySortPo, String> preparation) {
        super(preparation);
    }

    /**
     * Instantiate a QueryVo with a method which returns all rows.
     */
    public CommoditySortQueryVo() {
        super();
    }
}
