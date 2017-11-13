package trapx00.lightx00.client.presentation.financeui.factory;

import trapx00.lightx00.client.presentation.financeui.ReceivalBillUiController;
import trapx00.lightx00.client.presentation.financeui.mock.ReceivalBillUiControllerMock;
import trapx00.lightx00.client.presentation.helpui.ContinueWritable;

public class ReceivalBillUiFactory {
    private static ReceivalBillUiController receivalBillUiController = new ReceivalBillUiControllerMock();

    public static ContinueWritable getReceivalBillContinueWritable() {
        return receivalBillUiController;
    }
}
