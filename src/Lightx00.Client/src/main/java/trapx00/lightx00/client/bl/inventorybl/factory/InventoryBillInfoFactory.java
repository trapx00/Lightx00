package trapx00.lightx00.client.bl.inventorybl.factory;

import trapx00.lightx00.client.bl.inventorybl.InventoryDetailBillInfo;
import trapx00.lightx00.client.bl.inventorybl.InventoryGiftBlController;
import trapx00.lightx00.client.bl.inventorybl.InventoryGiftInfo;
import trapx00.lightx00.client.bl.inventorybl.InventoryWarningBlController;
import trapx00.lightx00.client.bl.inventorybl.mock.InventoryWarningBlControllerMock;
import trapx00.lightx00.client.bl.inventorybl.mock.InventoryGiftBlControllerMock;

public class InventoryBillInfoFactory {
    private static InventoryDetailBillInfo inventoryDetailBillInfo =new InventoryWarningBlController();
    private static InventoryGiftInfo inventoryGiftInfo =new InventoryGiftBlController();


    public static InventoryDetailBillInfo getInventoryDetailBillInfo(){
        return inventoryDetailBillInfo;
    }

    public static InventoryGiftInfo getInventoryGiftInfo(){
        return inventoryGiftInfo;
    }
}
