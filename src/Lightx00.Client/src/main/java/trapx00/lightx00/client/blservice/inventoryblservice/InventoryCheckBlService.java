package trapx00.lightx00.client.blservice.inventoryblservice;

import java.io.File;
import java.util.Date;

import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryPictureVo;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryViewVo;



public interface InventoryCheckBlService {
    /**
     *
     * @param beginTime
     * @param endTime
     * @return
     */
    InventoryViewVo check(Date beginTime, Date endTime);//库存查看

    /**
     *
     * @return
     */
    InventoryPictureVo picture();//库存盘点

    /**
     *
     * @param newfile
     * @return
     */
    ResultMessage export(File newfile);//导出Excel
}