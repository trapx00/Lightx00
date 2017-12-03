package trapx00.lightx00.client.bl.inventorybl.factory;

import trapx00.lightx00.client.bl.inventorybl.PurchaseRefundBillBlController;
import trapx00.lightx00.client.bl.inventorybl.mock.PurchaseRefundBillBlControllerMock;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;

public class PurchaseRefundBillBlFactory {

    private static PurchaseRefundBillBlController purchaseRefundBillBlController = new PurchaseRefundBillBlControllerMock();
    private static NotificationActivateService notificationActivateService = purchaseRefundBillBlController;
    private static NotificationAbandonService notificationAbandonService = purchaseRefundBillBlController;

    public static PurchaseRefundBillBlController getPurchaseRefundBillBlController() {
        return purchaseRefundBillBlController;
    }

    public static NotificationActivateService getNotificationActivateService() {
        return notificationActivateService;
    }

    public static NotificationAbandonService getNotificationAbandonService() {
        return notificationAbandonService;
    }
}
