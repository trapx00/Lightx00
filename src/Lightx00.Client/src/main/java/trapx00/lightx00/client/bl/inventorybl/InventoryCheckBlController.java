package trapx00.lightx00.client.bl.inventorybl;

import trapx00.lightx00.client.blservice.inventoryblservice.InventoryCheckBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryPictureVo;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryViewVo;

import java.io.File;
import java.util.Date;

public class InventoryCheckBlController implements InventoryCheckBlService {
    @Override
    public InventoryViewVo check(Date beginTime, Date endTime) {
        return null;
    }

    @Override
    public InventoryPictureVo picture() {
        return null;
    }

    @Override
    public ResultMessage export(File newfile) {
        return null;
    }
}
