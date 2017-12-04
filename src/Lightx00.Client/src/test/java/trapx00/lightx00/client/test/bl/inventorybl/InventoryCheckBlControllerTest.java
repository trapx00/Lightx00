package trapx00.lightx00.client.test.bl.inventorybl;

import org.junit.Test;
import trapx00.lightx00.client.bl.inventorybl.InventoryCheckBlController;
import trapx00.lightx00.client.bl.inventorybl.factory.InventoryCheckServiceFactory;
import trapx00.lightx00.client.vo.inventorystaff.InventoryViewVo;
import trapx00.lightx00.shared.po.ResultMessage;

import java.io.File;
import java.util.Date;

import static org.junit.Assert.*;

public class InventoryCheckBlControllerTest {

    private InventoryCheckBlController service= InventoryCheckServiceFactory.getInventoryCheckBlController();

    File file=new File("");
    Date date=new Date();

    @Test
    public void check() throws Exception {
        Date endtime=new Date();
       InventoryViewVo inventoryViewVo=service.getInventoryView(new Date(),new Date());
        assertEquals("208.0",inventoryViewVo.getId());
    }

    @Test
    public void picture() throws Exception {

        assertEquals("C0001",service.getInventoryPicture().getItems().length);
    }

    @Test
    public void export() throws Exception {
      //  assertEquals(ResultMessage.Success,service.export(new File()));
    }

}