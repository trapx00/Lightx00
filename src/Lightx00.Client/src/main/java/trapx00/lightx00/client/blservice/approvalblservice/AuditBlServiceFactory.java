package trapx00.lightx00.client.blservice.approvalblservice;

import trapx00.lightx00.client.bl.approvalbl.factory.AuditFactory;

public class AuditBlServiceFactory {
    public static AuditBlService getInstance(){
        return AuditFactory.getController();
    }
}
