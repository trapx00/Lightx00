package trapx00.lightx00.client.bl.inventorybl;

import trapx00.lightx00.client.blservice.inventoryblservice.InventoryWarningBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryBillQueryVo;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryBillVo;

public class InventoryWarningBlController implements InventoryWarningBlService {

    @Override
    public ResultMessage submit(InventoryBillVo bill) {
        return null;
    }

    @Override
    public ResultMessage saveAsDraft(InventoryBillVo bill) {
        return null;
    }

    @Override
    public ResultMessage modify(String id, double modifyWarning) {
        return null;
    }

    @Override
    public InventoryBillVo getCurrentBill() {
        return null;
    }

    @Override
    public InventoryBillVo[] query(InventoryBillQueryVo inventoryBillQueryVo) {
        return new InventoryBillVo[0];
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public CommodityVo[] getAllCommodity() {
        return new CommodityVo[0];
    }
}
