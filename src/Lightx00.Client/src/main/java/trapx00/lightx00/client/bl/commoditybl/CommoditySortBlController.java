package trapx00.lightx00.client.bl.commoditybl;

import trapx00.lightx00.client.blservice.commodityblservice.CommoditySortBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.inventorystaff.CommoditySortQueryVo;
import trapx00.lightx00.client.vo.inventorystaff.CommoditySortVo;

public class CommoditySortBlController implements CommoditySortBlService,CommoditySortService {
    /**
     * Add a commoditySort
     * @param newSort
     * @param parentSort
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage add(CommoditySortVo newSort, CommoditySortVo parentSort) {
        return null;
    }

    /**
     * Modifys a commoditySort
     * @param sort
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage modify(CommoditySortVo sort) {
        return null;
    }

    /**
     * Querys a commoditySort
     * @param commoditySortQueryVo
     * @return The commoditySort that match to the requirement
     */
    @Override
    public CommoditySortVo[] query(CommoditySortQueryVo commoditySortQueryVo) {
        return new CommoditySortVo[0];
    }

    /**
     * Deletes a commoditySort
     * @param sort
     * @return whether the operation is done successfully
     */
    @Override
    public ResultMessage delete(CommoditySortVo sort) {
        return null;
    }

    /**
     * Display all commoditySorts
     * @return The list of all commoditySorts
     */
    @Override
    public CommoditySortVo[] display() {
        return new CommoditySortVo[0];
    }

    /**
     * Display child commoditySort
     * @param commoditySort
     * @return The list of child commoditySort
     */
    @Override
    public CommoditySortVo[] dispaly(CommoditySortVo commoditySort) {
        return new CommoditySortVo[0];
    }

    /**
     * Query a commoditySort
     * @param commoditySortQueryVo
     * @return commodtySort that match query condition
     */
    @Override
    public CommoditySortVo[] queryCommoditySort(CommoditySortQueryVo commoditySortQueryVo) {
        return new CommoditySortVo[0];
    }
}
