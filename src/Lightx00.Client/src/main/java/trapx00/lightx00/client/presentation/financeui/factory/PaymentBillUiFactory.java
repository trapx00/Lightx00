package trapx00.lightx00.client.presentation.financeui.factory;

import trapx00.lightx00.client.presentation.financeui.PaymentBillUiController;
import trapx00.lightx00.client.presentation.financeui.mock.PaymentBillUiControllerMock;
import trapx00.lightx00.client.presentation.helpui.ContinueWritable;

public class PaymentBillUiFactory {
    private static PaymentBillUiController paymentBillUiController = new PaymentBillUiControllerMock();

    public static ContinueWritable getPaymentBillContinueWritable() {
        return paymentBillUiController;
    }
}
