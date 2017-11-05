package trapx00.lightx00.client.blservice.draftblservice;

import trapx00.lightx00.client.bl.draftbl.DraftBlController;

public class DraftManagementBlServiceFactory {
    private  static DraftManagementBlService instance = new DraftBlController();

    public static DraftManagementBlService getInstance() {
        return instance;
    }
}
