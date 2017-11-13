package trapx00.lightx00.client.presentation.inventoryui.factory;

import trapx00.lightx00.client.presentation.helpui.ContinueWritable;
import trapx00.lightx00.client.presentation.inventoryui.InventoryWarningUiController;
import trapx00.lightx00.client.presentation.inventoryui.mock.InventoryWarningUiControllerMock;

public class InventoryWarningUiFactory {
    private static InventoryWarningUiController inventoryWarningUiController = new InventoryWarningUiControllerMock();

    public static ContinueWritable getInventoryWarningContinueWritable() {
        return inventoryWarningUiController;
    }

}
