package trapx00.lightx00.client.bl.inventorybl.factory;

import trapx00.lightx00.client.bl.inventorybl.InventoryCheckBlController;
import trapx00.lightx00.client.bl.inventorybl.mock.InventoryCheckBlControllerMock;

public class InventoryCheckServiceFactory {
    private static InventoryCheckBlController controller=new InventoryCheckBlControllerMock();

    public static InventoryCheckBlController getInventoryCheckBlController(){
        return controller;
    }

}
