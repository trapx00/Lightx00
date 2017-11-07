package trapx00.lightx00.client.bl.financebl.factory;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.financebl.InitialEstablishmentBlController;
import trapx00.lightx00.client.bl.financebl.PaymentBillBlController;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;

public class InitialEstablishmentBillFactory {
    private static InitialEstablishmentBlController controller = new InitialEstablishmentBlController();
    private static DraftDeleteService draftDeleteService = controller;

    public static DraftDeleteService getDraftDeleteService() {
        return draftDeleteService;
    }
}
