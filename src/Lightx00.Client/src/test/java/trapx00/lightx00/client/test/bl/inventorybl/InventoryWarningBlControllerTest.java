package trapx00.lightx00.client.test.bl.inventorybl;

import org.junit.Test;
import trapx00.lightx00.client.bl.inventorybl.InventoryWarningBlController;
import trapx00.lightx00.client.bl.inventorybl.factory.InventoryWarningServiceFactory;
import trapx00.lightx00.client.vo.inventorystaff.CommodityQueryVo;
import trapx00.lightx00.client.vo.inventorystaff.CommoditySortQueryVo;
import trapx00.lightx00.client.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.client.vo.inventorystaff.InventoryBillVo;
import trapx00.lightx00.shared.po.ResultMessage;

import static org.junit.Assert.*;

public class InventoryWarningBlControllerTest {
    private InventoryWarningBlController service= InventoryWarningServiceFactory.getInventoryWarningBlController();
    InventoryBillVo inventoryBillVo=null;
    CommodityVo commodityVo=null;
    @Test
    public void submit() throws Exception {
        assertEquals(ResultMessage.Success,service.submit(inventoryBillVo));
    }

    @Test
    public void saveAsDraft() throws Exception {
        assertEquals(ResultMessage.Success,service.submit(inventoryBillVo));
    }

    @Test
    public void modify() throws Exception {
        assertEquals(ResultMessage.Success,service.modify("01111",100));
    }

    @Test
    public void getCurrentBill() throws Exception {
        assertEquals("B0001",service.getCurrentBill().getId());
    }

  //  @Test
  //  public void query() throws Exception {
  //  }

 //   @Test
//    public void getId() throws Exception {
  //      assertEquals("B0001",service.getId());
  //  }

    @Test
    public void deleteDraft() throws Exception {
        assertEquals(ResultMessage.Success, service.deleteDraft("SKD-20171112-00001"));
    }

    @Test
    public void abandon() throws Exception {
        assertEquals(ResultMessage.Success, service.abandon("SKD-20171112-00001"));
    }

    @Test
    public void activate() throws Exception {
        assertEquals(ResultMessage.Success, service.activate("SKD-20171112-00001"));
    }

    @Test
    public void queryCommodity() throws Exception {
        assertNotNull(new CommodityQueryVo("X0001","1qwe"));
    }

    @Test
    public void queryInventoryBill() throws Exception {
        assertNotNull(new CommoditySortQueryVo("X0001","1qwe","123"));
    }

}