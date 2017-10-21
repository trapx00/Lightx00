package trapx00.lightx00.client.blservice.commodityblservice;


import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.inventorystaff.CommoditySortVO;

public interface ProductManagementBLService{
    public ResultMessage add(CommoditySortVO newCSort, CommoditySortVO parentSort);//新建分类
    public ResultMessage modify(CommoditySortVO CSort);//修改分类
    public CommoditySortVO[] query(String ID, String name);//查询分类
    public ResultMessage delete(CommoditySortVO CSort);//删除分类
    public CommoditySortVO[] display();//得到all
    public CommoditySortVO[] dispaly(CommoditySortVO commoditySort);//得到子类
}