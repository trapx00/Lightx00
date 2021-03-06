package trapx00.lightx00.client.presentationdriver.inventoryblservice;

import org.junit.Test;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryWarningBlService;
import trapx00.lightx00.client.blservicestub.inventoryblservice.InventoryWarningBlServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;
import trapx00.lightx00.shared.vo.inventorystaff.CommodityVo;
import trapx00.lightx00.shared.vo.inventorystaff.InventoryBillVo;

import static org.junit.Assert.*;

public class InventoryWarningBlServiceDriver {
    InventoryWarningBlService service=new InventoryWarningBlServiceStub();
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
    public void resume() throws Exception {
        assertEquals("B0001",service.resume().getId());
    }

    @Test
    public void modify() throws Exception {
        assertEquals(ResultMessage.Success,service.modify(commodityVo,100));
    }

    @Test
    public void getCurrentBill() throws Exception {
        assertEquals("B0001",service.getCurrentBill().getId());
    }

}