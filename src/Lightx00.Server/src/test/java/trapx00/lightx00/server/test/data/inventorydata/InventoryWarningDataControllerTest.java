package trapx00.lightx00.server.test.data.inventorydata;

import org.junit.Test;
import trapx00.lightx00.server.data.inventorydata.factory.InventoryWarningDataFactory;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryWarningDataService;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillType;

import java.util.Date;

import static org.junit.Assert.*;

public class InventoryWarningDataControllerTest {

    InventoryWarningDataService service= InventoryWarningDataFactory.getService();

    InventoryBillPo inventoryBillPo=new InventoryBillPo("B0001",new Date(), BillState.Approved, InventoryBillType.Loss);
    CommodityPo commodityPo=null;

    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success,service.submit(inventoryBillPo));
    }

    @Test
    public void modify() throws Exception {
        assertEquals(ResultMessage.Success,service.modify("01111",100));
    }

    @Test
    public void getId() throws Exception {
        assertEquals(null,service.getId());
    }

   // @Test
  //  public void query() throws Exception {
  //  }

}