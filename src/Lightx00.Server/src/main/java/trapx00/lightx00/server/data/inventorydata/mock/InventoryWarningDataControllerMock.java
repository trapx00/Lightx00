package trapx00.lightx00.server.data.inventorydata.mock;

import trapx00.lightx00.shared.dataservicestub.inventorydataservice.InventoryWarningDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillType;
import trapx00.lightx00.shared.po.inventorystaff.InventoryDetailBillPo;
import trapx00.lightx00.shared.queryvo.InventoryBillQueryVo;

import java.rmi.RemoteException;
import java.util.Date;

public class InventoryWarningDataControllerMock extends InventoryWarningDataServiceStub {

    public InventoryWarningDataControllerMock() throws RemoteException {
    }

    @Override
    public ResultMessage submit(InventoryDetailBillPo bill) {
        return ResultMessage.Success;
    }

    @Override
    public String getId() {
        return null;
    }

    @Override
    public ResultMessage modify(String id, double warningValue) {
        return ResultMessage.Success;
    }



    @Override
    public InventoryDetailBillPo[] query(InventoryBillQueryVo inventoryBillQueryVo) {
        InventoryDetailBillPo inventoryBillVo=new InventoryDetailBillPo("L0001", new Date(),BillState.Approved,InventoryBillType.Overflow
        ,null,null,null,null);
        InventoryDetailBillPo[]input={inventoryBillVo};
        return  input;
    }



}
