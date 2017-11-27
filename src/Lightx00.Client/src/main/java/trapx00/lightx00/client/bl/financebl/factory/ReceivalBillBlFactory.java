package trapx00.lightx00.client.bl.financebl.factory;

import trapx00.lightx00.client.bl.draftbl.DraftDeleteService;
import trapx00.lightx00.client.bl.financebl.ReceivalBillBlController;
import trapx00.lightx00.client.bl.financebl.ReceivalBillInfo;
import trapx00.lightx00.client.bl.financebl.mock.ReceivalBillBlControllerMock;
import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.bl.approvalbl.BillApprovalCompleteService;

public class ReceivalBillBlFactory {
    private static ReceivalBillBlController controller = new ReceivalBillBlControllerMock();
    private static NotificationActivateService notificationActivateService = controller;
    private static NotificationAbandonService notificationAbandonService = controller;
    private static DraftDeleteService draftDeleteService = controller;
    private static ReceivalBillInfo receivalBillInfo = controller;
    private static BillApprovalCompleteService billApprovalCompleteService = controller;

    public static BillApprovalCompleteService getBillApprovalCompleteService() {
        return billApprovalCompleteService;
    }


    public static ReceivalBillInfo getReceivalBillInfo() {
        return receivalBillInfo;
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

    public static ReceivalBillBlController getController() {
        return controller;
    }
}