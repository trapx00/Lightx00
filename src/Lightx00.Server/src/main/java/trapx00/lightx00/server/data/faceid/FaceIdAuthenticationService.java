package trapx00.lightx00.server.data.faceid;

import trapx00.lightx00.shared.po.ResultMessage;

public interface FaceIdAuthenticationService {


    /**
     * Authenticate with image.
     * @param image image in binary
     * @return registered employee id if login is successful. null otherwise
     */
    String authenticate(byte[] image);

}
