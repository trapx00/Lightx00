package trapx00.lightx00.shared.dataservice.commoditydataservice;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.inventorystaff.CommoditySortPO;

public interface ProductManagementDataService {
    public ResultMessage add(CommoditySortPO newCSort, CommoditySortPO parentSort);//增加分类
    public ResultMessage modify(CommoditySortPO  CSort);//修改分类
    public CommoditySortPO[] query(String id, String name);//查询
    public ResultMessage delete(CommoditySortPO  CSort);//删除
    public CommoditySortPO[] display();//
    public CommoditySortPO[] dispaly(CommoditySortPO commoditySort);
    public void init();

}
