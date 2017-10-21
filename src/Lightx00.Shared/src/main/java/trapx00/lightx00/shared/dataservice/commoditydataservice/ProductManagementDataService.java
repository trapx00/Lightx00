package trapx00.lightx00.shared.dataservice.commoditydataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommoditySortPo;

public interface ProductManagementDataService {
    public ResultMessage add(CommoditySortPo newCSort, CommoditySortPo parentSort);//增加分类
    public ResultMessage modify(CommoditySortPo  CSort);//修改分类
    public CommoditySortPo[] query(String id, String name);//查询
    public ResultMessage delete(CommoditySortPo  CSort);//删除
    public CommoditySortPo[] display();//
    public CommoditySortPo[] dispaly(CommoditySortPo commoditySort);
    public void init();

}
