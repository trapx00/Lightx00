package trapx00.lightx00.client.bl.logbl.factory;

import trapx00.lightx00.client.bl.logbl.LogBlController;
import trapx00.lightx00.client.bl.logbl.mock.LogBlControllerMock;

public class LogBlFactory {
    private static LogBlController controller = new LogBlControllerMock();

    public static LogBlController getController() {
        return controller;
    }
}
