package trapx00.lightx00.client.bl.inventorybl.factory;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.inventorybl.InventoryGiftBlController;
import trapx00.lightx00.client.bl.inventorybl.mock.InventoryGiftBlControllerMock;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;

public class InventoryGiftServiceFactory {
    private static InventoryGiftBlController controller=new InventoryGiftBlControllerMock();
    private static NotificationActivateService notificationActivateService = controller;
    private static NotificationAbandonService notificationAbandonService = controller;
    private static DraftDeleteService draftDeleteService = controller;

    public static InventoryGiftBlController getInventoryGiftBlController(){
        return controller;
    }
    public static NotificationActivateService getNotificationActivateService() {
        return notificationActivateService;
    }

    public static NotificationAbandonService getNotificationAbandonService() {
        return notificationAbandonService;
    }

    public static DraftDeleteService getDraftDeleteService() {
        return draftDeleteService;
    }
}
