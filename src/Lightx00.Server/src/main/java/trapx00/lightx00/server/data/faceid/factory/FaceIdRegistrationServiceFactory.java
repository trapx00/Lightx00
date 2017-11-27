package trapx00.lightx00.server.data.faceid.factory;

import trapx00.lightx00.server.data.faceid.FaceIdRegistrationController;
import trapx00.lightx00.server.data.faceid.FaceIdRegistrationService;
import trapx00.lightx00.server.data.faceid.mock.FaceIdRegistrationControllerMock;

public class FaceIdRegistrationServiceFactory {
    private static FaceIdRegistrationService service = new FaceIdRegistrationController();

    public static FaceIdRegistrationService getService() {
        return service;
    }
}
