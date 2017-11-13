package trapx00.lightx00.shared.bldriver.inventorydataservice;

import org.junit.Test;
import trapx00.lightx00.shared.dataservice.inventorydataservice.InventoryWarningDataService;
import trapx00.lightx00.shared.dataservicestub.inventorydataservice.InventoryWarningDataServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.po.bill.BillState;
import trapx00.lightx00.shared.po.inventorystaff.CommodityPo;
import trapx00.lightx00.shared.po.inventorystaff.InventoryBillPo;

import java.util.Date;

import static org.junit.Assert.*;

public class InventoryWarningDataServiceDriver {
    InventoryWarningDataService service=new InventoryWarningDataServiceStub();
    CommodityPo commodityPo=null;
    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success,service.submit(new InventoryBillPo("S0001",new Date(), BillState.Approved,null)));
    }

    @Test
    public void modify() throws Exception {
        assertEquals(ResultMessage.Success,service.modify("C0001",100));

    }

    @Test
    public void getAlarmByIds() throws Exception {
        assertEquals("L0001",service.getAlarmByIds("L0001")[0].getId());
    }

    @Test
    public void getOverflowByIds() throws Exception {
        assertEquals("L0001",service.getOverflowByIds("L0001")[0].getId());
    }

    @Test
    public void getLossByIds() throws Exception {
        assertEquals("L0001",service.getLossByIds("L0001")[0].getId());
    }

   // @Test
    //public void init() throws Exception {
   // }

}