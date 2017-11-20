package trapx00.lightx00.client.presentation.approvalui.factory;

import trapx00.lightx00.client.bl.approvalbl.AuditBlController;
import trapx00.lightx00.client.bl.approvalbl.mock.AuditBlControllerMock;

public class AuditUiFactory {
    private static AuditBlController controller = new AuditBlControllerMock();

    public static AuditBlController getController() {
        return controller;
    }
}