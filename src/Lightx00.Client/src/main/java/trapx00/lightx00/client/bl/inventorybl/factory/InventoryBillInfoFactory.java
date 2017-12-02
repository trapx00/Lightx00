package trapx00.lightx00.client.bl.inventorybl.factory;

import trapx00.lightx00.client.bl.inventorybl.InventoryBillInfo;
import trapx00.lightx00.client.bl.inventorybl.mock.InventoryBillInfoControllerMock;

public class InventoryBillInfoFactory {
    private static InventoryBillInfo inventoryBillInfo =new InventoryBillInfoControllerMock();

    public static InventoryBillInfo getInventoryBillInfo(){
        return inventoryBillInfo;
    }
}
