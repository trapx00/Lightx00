package trapx00.lightx00.client.blservicestub.inventoryblservice;

import trapx00.lightx00.client.blservice.inventoryblservice.InventoryWarningBlService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryBillVo;
import trapx00.lightx00.shared.queryvo.InventoryBillQueryVo;

import java.util.Date;

public class InventoryWarningBlServiceStub implements InventoryWarningBlService {
    @Override
    public ResultMessage submit(InventoryBillVo bill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage saveAsDraft(InventoryBillVo bill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage modify(String id, double modifyWarning) {
        return null;
    }

    @Override
    public InventoryBillVo getCurrentBill() {
        return new InventoryBillVo("B0001",new Date(), BillState.Draft,null,null,null,null);
    }

    @Override
    public InventoryBillVo[] query(InventoryBillQueryVo inventoryBillQueryVo) {
        return new InventoryBillVo[0];
    }

    @Override
    public String getId() {
        return null;
    }
}
