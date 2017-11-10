package trapx00.lightx00.client.bl.commoditybl;

import trapx00.lightx00.client.blservice.commodityblservice.CommodityBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.InventoryModificationFlag;
import trapx00.lightx00.shared.queryvo.CommodityQueryVo;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;

public class CommodityBlController implements CommodityBlService,CommodityService,InventoryModificationService {
    /**
     * Add a new commodity
     * @param newCommodity
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(CommodityVo newCommodity) {
        return null;
    }

    /**
     *  Modifys a commodity
     * @param updateCommodity
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(CommodityVo updateCommodity) {
        return null;
    }

    /**
     * Querys a commodity
     * @param commodityQueryVo
     * @return The commodity that match to the requirement
     */
    @Override
    public CommodityVo[] query(CommodityQueryVo commodityQueryVo) {
        return new CommodityVo[0];
    }

    /**
     * Deltes the existed commodity
     * @param commodity
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(CommodityVo commodity) {
        return null;
    }

    /**
     * Query a commodity
     * @param commodityQueryVo
     * @return Commodity that match query condition
     */
    @Override
    public CommodityVo[] queryCommodity(CommodityQueryVo commodityQueryVo) {
        return new CommodityVo[0];
    }

    /**
     * Modify the inventoryNum
     * @param commodityId
     * @param flag
     * @param delta
     * @return ResultMessage
     */
    @Override
    public ResultMessage modifyInventory(String commodityId, InventoryModificationFlag flag, double delta) {
        return null;
    }
}
