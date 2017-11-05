package trapx00.lightx00.client.bl.financebl;

public class BillQueryFactory {
    private static CashBillInfo cashbillInfo = new CashBillBlController();
    private static PaymentBillInfo paymentBillInfo = new PaymentBillBlController();
    private static ReceivalBillInfo receivalBillInfo = new ReceivalBillBlController();
    private static SystemSnapshotInfo systemSnapshotInfo = new InitialEstablishmentBlController();


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
