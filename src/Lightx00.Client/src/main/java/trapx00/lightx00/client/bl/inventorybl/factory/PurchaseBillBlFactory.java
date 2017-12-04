package trapx00.lightx00.client.bl.inventorybl.factory;

import trapx00.lightx00.client.bl.approvalbl.BillApprovalCompleteService;
import trapx00.lightx00.client.bl.inventorybl.PurchaseBillBlController;
import trapx00.lightx00.client.bl.inventorybl.mock.PurchaseBillBlControllerMock;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;

public class PurchaseBillBlFactory {

    private static PurchaseBillBlController purchaseBillBlController = new PurchaseBillBlControllerMock();
    private static NotificationActivateService notificationActivateService = purchaseBillBlController;
    private static NotificationAbandonService notificationAbandonService = purchaseBillBlController;
    private static BillApprovalCompleteService billApprovalCompleteService = purchaseBillBlController;

    public static PurchaseBillBlController getPurchaseBillBlController() {
        return purchaseBillBlController;
    }

    public static NotificationActivateService getNotificationActivateService() {
        return notificationActivateService;
    }

    public static NotificationAbandonService getNotificationAbandonService() {
        return notificationAbandonService;
    }

    public static BillApprovalCompleteService getBillApprovalCompleteService() {
        return billApprovalCompleteService;
    }
}
