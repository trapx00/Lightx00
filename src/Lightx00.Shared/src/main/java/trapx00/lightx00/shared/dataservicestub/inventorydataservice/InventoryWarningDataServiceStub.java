package trapx00.lightx00.shared.dataservicestub.inventorydataservice;

import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryWarningDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillType;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryBillVo;

import java.util.Date;

public class InventoryWarningDataServiceStub implements InventoryWarningDataService {
    @Override
    public ResultMessage submit(InventoryBillPo bill) {
        return ResultMessage.Success;
    }

    @Override
    public ResultMessage modify(CommodityPo commodity, double warningValue) {
        return ResultMessage.Success;
    }

    @Override
    public InventoryBillPo[] getAlarmByIds(String... ids) {
        InventoryBillPo inventoryBillVo=new InventoryBillPo("L0001", new Date(),BillState.Approved, InventoryBillType.Warning);
        InventoryBillPo[]input={inventoryBillVo};
        return  input;
    }

    @Override
    public InventoryBillPo[] getOverflowByIds(String... ids) {
        InventoryBillPo inventoryBillVo=new InventoryBillPo("L0001", new Date(),BillState.Approved,InventoryBillType.Overflow);
        InventoryBillPo[]input={inventoryBillVo};
        return  input;
    }

    @Override
    public InventoryBillPo[] getLossByIds(String... ids) {
        InventoryBillPo inventoryBillVo=new InventoryBillPo("L0001", new Date(),BillState.Approved,InventoryBillType.Loss);
        InventoryBillPo[]input={inventoryBillVo};
        return  input;
    }

    @Override
    public void init() {

    }
}
