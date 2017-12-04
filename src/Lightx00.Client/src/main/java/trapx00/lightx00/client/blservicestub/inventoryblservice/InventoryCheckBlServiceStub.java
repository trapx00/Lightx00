package trapx00.lightx00.client.blservicestub.inventoryblservice;

import trapx00.lightx00.client.blservice.inventoryblservice.InventoryCheckBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryPictureVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryViewVo;

import java.io.File;
import java.util.Date;

public class InventoryCheckBlServiceStub implements InventoryCheckBlService {


    @Override
    public InventoryViewVo getInventoryView(Date beginTime, Date endTime) {
        return null;
    }

    @Override
    public InventoryPictureVo getInventoryPicture() {
        return null;
    }

    @Override
    public ResultMessage export(String newfile) {
        return ResultMessage.Success;
    }
}
