package trapx00.lightx00.server.data.commoditydata.mock;

import trapx00.lightx00.server.data.commoditydata.CommodityDataController;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.queryvo.CommodityQueryVo;

public class CommodityDataControllerMock extends CommodityDataController {
    /**
     *  Create a new commodity
     * @param newCommodity
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(CommodityPo newCommodity) {
        return super.add(newCommodity);
    }
    /**
     *  odiyf a commodity
     * @param updateCommodity
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(CommodityPo updateCommodity) {
        return super.modify(updateCommodity);
    }
    /**
     * uery for a commodity
     * @param commodityQueryVo
     * @return the list of the commodity
     */
    @Override
    public CommodityPo[] query(CommodityQueryVo commodityQueryVo) {
        return super.query(commodityQueryVo);
    }
    /**
     * Delete a commodity
     * @param commodity
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(CommodityPo commodity) {
        return super.delete(commodity);
    }
}
