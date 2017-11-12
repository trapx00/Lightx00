package trapx00.lightx00.server.data.logdata.factory;

import trapx00.lightx00.server.data.logdata.LogDataController;
import trapx00.lightx00.server.data.logdata.mock.LogDataControllerMock;
import trapx00.lightx00.shared.dataservice.logdataservice.LogDataService;

public class LogDataFactory {
    private static LogDataService service = new LogDataControllerMock();

    public static LogDataService getService() {
        return service;
    }
}
