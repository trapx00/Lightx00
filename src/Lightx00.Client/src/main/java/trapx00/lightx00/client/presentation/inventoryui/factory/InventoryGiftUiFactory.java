package trapx00.lightx00.client.presentation.inventoryui.factory;

import trapx00.lightx00.client.presentation.helpui.DraftContinueWritableUiController;
import trapx00.lightx00.client.presentation.inventoryui.InventoryGiftUiController;
import trapx00.lightx00.client.presentation.inventoryui.mock.InventoryGiftUiControllerMock;

public class InventoryGiftUiFactory {
    private static InventoryGiftUiController inventoryGiftUiController = new InventoryGiftUiControllerMock();

    public static DraftContinueWritableUiController getInventoryGiftContinueWritable() {
        return inventoryGiftUiController;
    }

}
