package trapx00.lightx00.server.data.commoditydata.mock;

import trapx00.lightx00.server.data.commoditydata.CommoditySortDataController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommoditySortPo;
import trapx00.lightx00.shared.vo.inventorystaff.CommoditySortQueryVo;

public class CommoditySortDataControllerMock extends CommoditySortDataController {
    /**
     * Create a new commoditySort attaching to a parentSort
     * @param newCSort
     * @param parentSort
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(CommoditySortPo newCSort, CommoditySortPo parentSort) {
        return super.add(newCSort, parentSort);
    }
    /**
     * Modify a commoditySort
     * @param commoditySort
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(CommoditySortPo commoditySort) {
        return super.modify(commoditySort);
    }
    /**
     *  Query a commodifySort
     * @param commoditySortQueryVo
     * @return the list of the commoditySort
     */
    @Override
    public CommoditySortPo[] query(CommoditySortQueryVo commoditySortQueryVo) {
        return super.query(commoditySortQueryVo);
    }
    /**
     *  Delete a commoditySort
     * @param commoditySort
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(CommoditySortPo commoditySort) {
        return super.delete(commoditySort);
    }
    /**
     * Display all commoditySorts
     * @return the list of commoditySort
     */
    @Override
    public CommoditySortPo[] display() {
        return super.display();
    }
    /**
     *  Get the childsoft of a commoditySort
     * @param commoditySort
     * @return the childCommoditySort
     */
    @Override
    public CommoditySortPo[] dispaly(CommoditySortPo commoditySort) {
        return super.dispaly(commoditySort);
    }

}
