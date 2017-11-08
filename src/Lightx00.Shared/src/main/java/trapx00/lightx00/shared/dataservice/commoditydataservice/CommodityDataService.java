package trapx00.lightx00.shared.dataservice.commoditydataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.queryvo.CommodityQueryVo;


public interface CommodityDataService {

    /**
     *  Create a new commodity
     * @param newCommodity
     * @return whether the operation is done successfully
     */
    ResultMessage add(CommodityPo newCommodity);//新建商品

    /**
     *  odiyf a commodity
     * @param updateCommodity
     * @return whether the operation is done successfully
     */
    ResultMessage modify(CommodityPo updateCommodity);//修改

    /**
     * uery for a commodity
     * @param commodityQueryVo
     * @return the list of the commodity
     */
    CommodityPo[] query(CommodityQueryVo commodityQueryVo);//查询

    /**
     * Delete a commodity
     * @param commodity
     * @return whether the operation is done successfully
     */
    ResultMessage delete(CommodityPo commodity);//删除

    void init();//初始化

}
