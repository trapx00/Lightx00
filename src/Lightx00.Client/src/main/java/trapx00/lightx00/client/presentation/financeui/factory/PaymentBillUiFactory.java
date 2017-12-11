package trapx00.lightx00.client.presentation.financeui.factory;

import trapx00.lightx00.client.presentation.financeui.paymentandreceival.PaymentBillUiController;
import trapx00.lightx00.client.presentation.financeui.mock.PaymentBillUiControllerMock;

public class PaymentBillUiFactory {
    private static PaymentBillUiController paymentBillUiController = new PaymentBillUiControllerMock();

    public static PaymentBillUiController getPaymentBillContinueWritable() {
        return paymentBillUiController;
    }
}
