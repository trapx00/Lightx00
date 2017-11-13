package trapx00.lightx00.server.data.util.serverlogservice.factory;

import trapx00.lightx00.server.data.util.serverlogservice.ServerLogService;
import trapx00.lightx00.server.data.util.serverlogservice.ServerLogServiceController;
import trapx00.lightx00.server.data.util.serverlogservice.mock.ServerLogServiceControllerMock;

public class ServerLogServiceFactory {
    private ServerLogServiceController controller = new ServerLogServiceControllerMock();

    public ServerLogService getService() {
        return controller;
    }
}
