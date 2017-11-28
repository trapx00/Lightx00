package trapx00.lightx00.client.bl.commoditybl.mock;

import trapx00.lightx00.client.bl.commoditybl.CommoditySortBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.inventorystaff.CommoditySortVo;

public class CommoditySortBlControllerMock extends CommoditySortBlController {

    /**
     * Add a commoditySort
     * @param newSort
     * @param parentSort
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(CommoditySortVo newSort, CommoditySortVo parentSort) {
        return super.add(newSort, parentSort);
    }

    /**
     * Modifys a commoditySort
     * @param sort
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(CommoditySortVo sort) {
        return super.modify(sort);
    }

    /**
     * Querys a commoditySort
     * @param commoditySortQueryVo
     * @return The commoditySort that match to the requirement
     */
    @Override
    public CommoditySortVo[] query(CommoditySortQueryVo commoditySortQueryVo) {
        return super.query(commoditySortQueryVo);
    }

    /**
     * Deletes a commoditySort
     * @param sort
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(CommoditySortVo sort) {
        return super.delete(sort);
    }

    /**
     * Display all commoditySorts
     * @return The list of all commoditySorts
     */
    @Override
    public CommoditySortVo[] display() {
        return super.display();
    }

    /**
     * Display child commoditySort
     * @param commoditySort
     * @return The list of child commoditySort
     */
    @Override
    public CommoditySortVo[] dispaly(CommoditySortVo commoditySort) {
        return super.dispaly(commoditySort);
    }

}
