package trapx00.lightx00.client.bl.commoditybl.mock;

import trapx00.lightx00.client.bl.commoditybl.CommodityBlController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;

public class CommodityBlControllerMock extends CommodityBlController {

    /**
     * Add a new commodity
     * @param newCommodity
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(CommodityVo newCommodity) {
        return super.add(newCommodity);
    }

    /**
     *  Modifys a commodity
     * @param updateCommodity
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(CommodityVo updateCommodity) {
        return super.modify(updateCommodity);
    }

    /**
     * Querys a commodity
     * @param id
     * @return The commodity that match to the requirement
     */
    @Override
    public CommodityVo[] query(String id) {
        return super.query(id);
    }

    /**
     * Deltes the existed commodity
     * @param commodity
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(CommodityVo commodity) {
        return super.delete(commodity);
    }

}
