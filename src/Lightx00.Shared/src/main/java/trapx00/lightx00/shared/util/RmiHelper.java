package trapx00.lightx00.shared.util;

import java.security.cert.CollectionCertStoreParameters;
import java.util.Arrays;
import java.util.stream.Collectors;

public class RmiHelper {
    private static final String url = "localhost";
    private static final String port = "8888";

    public static String generateRmiUrl(Class... interfaces) {
        return "rmi://" + url + ":" + port + "/" + Arrays.stream(interfaces).map(Class::getName).collect(Collectors.joining("/"));

    }
}
