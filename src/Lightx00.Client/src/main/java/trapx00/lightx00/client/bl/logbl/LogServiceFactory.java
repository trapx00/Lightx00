package trapx00.lightx00.client.bl.logbl;

import trapx00.lightx00.client.bl.logbl.LogBlController;
import trapx00.lightx00.client.bl.logbl.LogService;

public class LogServiceFactory {
    /**
     * Gets a LogService instance.
     * @return LogService instance
     */
    public static LogService getInstance() {
        return new LogBlController();
    }
}
