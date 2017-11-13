package trapx00.lightx00.client.blservice.draftblservice;

import trapx00.lightx00.client.bl.draftbl.DraftBlController;
import trapx00.lightx00.client.bl.draftbl.factory.DraftServiceFactory;

public class DraftManagementBlServiceFactory {

    public static DraftManagementBlService getInstance() {
        return DraftServiceFactory.getController();
    }
}
