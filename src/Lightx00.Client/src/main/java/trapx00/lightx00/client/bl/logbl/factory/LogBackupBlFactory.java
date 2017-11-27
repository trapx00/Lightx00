package trapx00.lightx00.client.bl.logbl.factory;

import trapx00.lightx00.client.bl.logbl.LogBackupBlController;
import trapx00.lightx00.client.bl.logbl.mock.LogBackupBlControllerMock;

public class LogBackupBlFactory {
    private static LogBackupBlController controller = new LogBackupBlControllerMock();

    public static LogBackupBlController getController() {
        return controller;
    }
}
