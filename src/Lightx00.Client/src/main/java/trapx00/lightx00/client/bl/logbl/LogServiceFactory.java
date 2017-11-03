package trapx00.lightx00.client.bl.logbl;

public class LogServiceFactory {
    /**
     * Gets a LogService instance.
     * @return LogService instance
     */
    public static LogService getInstance() {
        return new LogBlController();
    }
}
