package trapx00.lightx00.client.bl.salebl.factory;

import trapx00.lightx00.client.bl.notificationbl.NotificationAbandonService;
import trapx00.lightx00.client.bl.notificationbl.NotificationActivateService;
import trapx00.lightx00.client.bl.salebl.SaleRefundBillBlController;
import trapx00.lightx00.client.bl.salebl.mock.SaleRefundBillBlControllerMock;

public class SaleRefundBillBlFactory {
    private static SaleRefundBillBlController saleRefundBillBlController=new SaleRefundBillBlControllerMock();
    private static NotificationActivateService notificationActivateService = saleRefundBillBlController;
    private static NotificationAbandonService notificationAbandonService = saleRefundBillBlController;


    public static SaleRefundBillBlController getSaleRefundBillBlController() {
        return saleRefundBillBlController;
    }

    public static NotificationActivateService getNotificationActivateService(){
        return notificationActivateService;
    }

    public static NotificationAbandonService getNotificationAbandonService(){
        return notificationAbandonService;
    }
}
