package trapx00.lightx00.server.data.faceid;

public class FaceIdAuthenticationController implements FaceIdAuthenticationService {
    /**
     * Authenticate with image.
     *
     * @param image image in binary
     * @return registered employee id if login is successful. null otherwise
     */
    @Override
    public String authenticate(byte[] image) {
        return null;
    }
}
