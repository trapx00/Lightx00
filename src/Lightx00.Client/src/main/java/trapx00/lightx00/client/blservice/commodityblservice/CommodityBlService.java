package trapx00.lightx00.client.blservice.commodityblservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityQueryVo;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;


public interface CommodityBlService {
    //商品管理

    /**
     *  Create a new commodity
     * @param newCommodity
     * @return whether the operation is done successfully
     */
    ResultMessage add(CommodityVo newCommodity);//新建商品

    /**
     *  odiyf a commodity
     * @param updateCommodity
     * @return whether the operation is done successfully
     */
    ResultMessage modify(CommodityVo updateCommodity);//修改商品

    /**
     * uery for a commodity
     * @param commodityQueryVo
     * @return the list of the commodity
     */
    CommodityVo[] query(CommodityQueryVo commodityQueryVo);//查询商品

    /**
     * Delete a commodity
     * @param commodity
     * @return whether the operation is done successfully
     */
    ResultMessage delete(CommodityVo commodity);//删除商品
}