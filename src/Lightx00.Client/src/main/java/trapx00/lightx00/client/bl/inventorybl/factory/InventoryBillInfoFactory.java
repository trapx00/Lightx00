package trapx00.lightx00.client.bl.inventorybl.factory;

import trapx00.lightx00.client.bl.inventorybl.InventoryDetailBillInfo;
import trapx00.lightx00.client.bl.inventorybl.InventoryGiftInfo;
import trapx00.lightx00.client.bl.inventorybl.mock.InventoryDetailWarningBlControllerMock;
import trapx00.lightx00.client.bl.inventorybl.mock.InventoryGiftBlControllerMock;

public class InventoryBillInfoFactory {
    private static InventoryDetailBillInfo inventoryDetailBillInfo =new InventoryDetailWarningBlControllerMock();
    private static InventoryGiftInfo inventoryGiftInfo =new InventoryGiftBlControllerMock();


    public static InventoryDetailBillInfo getInventoryDetailBillInfo(){
        return inventoryDetailBillInfo;
    }

    public static InventoryGiftInfo getInventoryGiftInfo(){
        return inventoryGiftInfo;
    }
}
