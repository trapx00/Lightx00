package trapx00.lightx00.shared.queryvo;

import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.CommoditySortPo;

import java.util.function.Predicate;

public class CommoditySortQueryVo extends  BaseQueryVo<CommoditySortPo,String, CommoditySortQueryVo> {
    public CommoditySortQueryVo() {
    }

    public CommoditySortQueryVo(BaseQueryVo another) {
        super(another);
    }
}
