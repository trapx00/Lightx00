package trapx00.lightx00.client.presentation.financeui.factory;

import trapx00.lightx00.client.presentation.financeui.InitialEstablishmentUiController;
import trapx00.lightx00.client.presentation.financeui.mock.InitialEstablishmentUiControllerMock;
import trapx00.lightx00.client.presentation.helpui.ContinueWritable;

public class InitialEstablishmentUiFactory {
    private static InitialEstablishmentUiController initialEstablishmentUiController = new InitialEstablishmentUiControllerMock();

    public static ContinueWritable getInitialEstablishmentContinueWritable() {
        return initialEstablishmentUiController;
    }
}
