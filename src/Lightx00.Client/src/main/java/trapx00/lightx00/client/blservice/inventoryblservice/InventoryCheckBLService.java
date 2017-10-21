package trapx00.lightx00.client.blservice.inventoryblservice;


import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryPictureVO;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryViewVO;

import java.io.File;
import java.util.Date;

public interface InventoryCheckBLService{
    public InventoryViewVO check(Date beginTime, Date endTime);//库存查看
    public InventoryPictureVO picture();//库存盘点
    public ResultMessage export(File newfile);//导出Excel
}