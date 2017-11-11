package trapx00.lightx00.client.bl.approvalbl.factory;

import trapx00.lightx00.client.bl.approvalbl.ApprovalRequest;
import trapx00.lightx00.client.bl.approvalbl.AuditBlController;

public class ApprovalRequestFactory {
    private static AuditBlController controller = new AuditBlController();
    private static ApprovalRequest approvalRequest = controller;

    public static ApprovalRequest getApprovalRequest(){
        return approvalRequest;
    }
}
