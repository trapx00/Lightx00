package trapx00.lightx00.client.bl.logbl.factory;

import trapx00.lightx00.client.bl.logbl.LogBlController;
import trapx00.lightx00.client.bl.logbl.LogService;
import trapx00.lightx00.client.bl.logbl.mock.LogBlControllerMock;

public class LogServiceFactory {
    private static LogService logService = new LogBlControllerMock();
    /**
     * Gets a LogService instance.
     * @return LogService instance
     */
    public static LogService getLogService() {
        return logService;
    }
}
