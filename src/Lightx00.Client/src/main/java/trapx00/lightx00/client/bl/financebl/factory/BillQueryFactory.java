package trapx00.lightx00.client.bl.financebl.factory;


import trapx00.lightx00.client.bl.financebl.CashBillInfo;
import trapx00.lightx00.client.bl.financebl.PaymentBillInfo;
import trapx00.lightx00.client.bl.financebl.ReceivalBillInfo;
import trapx00.lightx00.client.bl.financebl.SystemSnapshotInfo;

public class BillQueryFactory {
    private static CashBillInfo cashbillInfo = CashBillFactory.getCashBillInfo();
    private static PaymentBillInfo paymentBillInfo = PaymentBillFactory.getPaymentBillInfo();
    private static ReceivalBillInfo receivalBillInfo = ReceivalBillFactory.getReceivalBillInfo();
    private static SystemSnapshotInfo systemSnapshotInfo = InitialEstablishmentBillFactory.getSystemSnapshotInfo();


    public static CashBillInfo getCashbillInfo() {
        return cashbillInfo;
    }

    public static PaymentBillInfo getPaymentBillInfo() {
        return paymentBillInfo;
    }

    public static ReceivalBillInfo getReceivalBillInfo() {
        return receivalBillInfo;
    }

    public static SystemSnapshotInfo getSystemSnapshotInfo() {
        return systemSnapshotInfo;
    }
}
