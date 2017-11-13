package trapx00.lightx00.client.bl.financebl.factory;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.financebl.InitialEstablishmentBlController;
import trapx00.lightx00.client.bl.financebl.PaymentBillBlController;
import trapx00.lightx00.client.bl.financebl.SystemSnapshotInfo;
import trapx00.lightx00.client.bl.financebl.mock.InitialEstablishmentBlControllerMock;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;

public class InitialEstablishmentBlFactory {
    private static InitialEstablishmentBlController controller = new InitialEstablishmentBlControllerMock();
    private static DraftDeleteService draftDeleteService = controller;
    private static NotificationAbandonService notificationAbandonService = controller;
    private static NotificationActivateService notificationActivateService = controller;
    private static SystemSnapshotInfo systemSnapshotInfo = controller;

    public static SystemSnapshotInfo getSystemSnapshotInfo() {
        return systemSnapshotInfo;
    }

    public static DraftDeleteService getDraftDeleteService() {
        return draftDeleteService;
    }

    public static InitialEstablishmentBlController getController() {
        return controller;
    }

    public static NotificationAbandonService getNotificationAbandonService() {
        return notificationAbandonService;
    }

    public static NotificationActivateService getNotificationActivateService() {
        return notificationActivateService;
    }
}
