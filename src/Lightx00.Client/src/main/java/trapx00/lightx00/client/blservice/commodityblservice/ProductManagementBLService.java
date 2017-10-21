package trapx00.lightx00.client.blservice.commodityblservice;

import trapx00.lightx00.shared.po.ResultMessage;

import trapx00.lightx00.shared.vo.inventorystaff.CommoditySortVo;

public interface ProductManagementBlService {

    ResultMessage add(CommoditySortVo newSort, CommoditySortVo parentSort);//新建分类

    ResultMessage modify(CommoditySortVo sort);//修改分类

    CommoditySortVo[] query(String id, String name);//查询分类

    ResultMessage delete(CommoditySortVo sort);//删除分类

    CommoditySortVo[] display();//得到all

    CommoditySortVo[] dispaly(CommoditySortVo commoditySort);//得到子类
}