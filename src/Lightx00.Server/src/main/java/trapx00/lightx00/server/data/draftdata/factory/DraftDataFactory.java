package trapx00.lightx00.server.data.draftdata.factory;

import trapx00.lightx00.server.data.draftdata.mock.DraftDataControllerMock;
import trapx00.lightx00.shared.dataservice.draftdataservice.DraftManagementDataService;

public class DraftDataFactory {
    private static DraftManagementDataService service = new DraftDataControllerMock();

    public static DraftManagementDataService getService() {
        return service;
    }
}
