package trapx00.lightx00.client.test.presentationdriver.inventoryblservice;

import org.junit.Test;
import trapx00.lightx00.client.blservice.inventoryblservice.InventoryCheckBlService;
import trapx00.lightx00.client.blservicestub.inventoryblservice.InventoryCheckBlServiceStub;
import trapx00.lightx00.shared.po.ResultMessage;

import java.io.File;
import java.util.Date;

import static org.junit.Assert.*;

public class InventoryCheckBlServiceDriver {

    InventoryCheckBlService service=new InventoryCheckBlServiceStub() ;
    File file=new File("");
    Date date=new Date();


    @Test
    public void export() throws Exception {
        assertEquals(ResultMessage.Success,service.export(file));
    }

}