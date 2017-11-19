package trapx00.lightx00.client.bl.commoditybl;

import trapx00.lightx00.client.blservice.commodityblservice.CommodityBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.InventoryModificationFlag;
import trapx00.lightx00.client.vo.inventorystaff.CommodityQueryVo;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;



public class CommodityBlController implements CommodityBlService,CommodityService,InventoryModificationService {
    /**
     * Add a new commoditybl
     * @param newCommodity
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(CommodityVo newCommodity) {
        return ResultMessage.Success;
    }

    /**
     *  Modifys a commoditybl
     * @param updateCommodity
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(CommodityVo updateCommodity) {
        return ResultMessage.Success;
    }

    /**
     * Querys a commoditybl
     * @param commodityQueryVo
     * @return The commoditybl that match to the requirement
     */
    @Override
    public CommodityVo[] query(CommodityQueryVo commodityQueryVo) {
        return new CommodityVo[0];
    }

    /**
     * Deltes the existed commoditybl
     * @param commodity
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(CommodityVo commodity) {
        return ResultMessage.Success;
    }

    /**
     * Query a commoditybl
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
        return ResultMessage.Success;
    }
}
