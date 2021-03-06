package trapx00.lightx00.shared.dataservice.commoditydataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommoditySortPo;

public interface ProductManagementDataService {

    ResultMessage add(CommoditySortPo newCSort, CommoditySortPo parentSort);//增加分类

    ResultMessage modify(CommoditySortPo commoditySort);//修改分类

    CommoditySortPo[] query(String id, String name);//查询

    ResultMessage delete(CommoditySortPo commoditySort);//删除

    CommoditySortPo[] display();//

    CommoditySortPo[] dispaly(CommoditySortPo commoditySort);

    void init();

}
