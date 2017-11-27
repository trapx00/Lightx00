package trapx00.lightx00.server.data.faceid.factory;

import trapx00.lightx00.server.data.faceid.FaceIdAuthenticationService;
import trapx00.lightx00.server.data.faceid.mock.FaceIdAuthenticationControllerMock;

public class FaceIdAuthenticationServiceFactory {
    public static FaceIdAuthenticationService service = new FaceIdAuthenticationControllerMock();

    public static FaceIdAuthenticationService getService() {
        return service;
    }
}
