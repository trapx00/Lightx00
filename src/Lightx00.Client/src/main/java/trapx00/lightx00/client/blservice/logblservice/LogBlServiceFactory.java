package trapx00.lightx00.client.blservice.logblservice;

import trapx00.lightx00.client.bl.logbl.LogBlController;

public class LogBlServiceFactory {
    private static LogBlService instance = new LogBlController();

    public static LogBlService getInstance() {
        return instance;
    }
}
