package trapx00.lightx00.client.bl.financebl.factory;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.financebl.PaymentBillBlController;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;

public class PaymentBillFactory {
    private static PaymentBillBlController controller = new PaymentBillBlController();
    private static NotificationActivateService notificationActivateService = controller;
    private static NotificationAbandonService notificationAbandonService = controller;
    private static DraftDeleteService draftDeleteService = controller;

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
