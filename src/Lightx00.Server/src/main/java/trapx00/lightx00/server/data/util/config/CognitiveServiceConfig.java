package trapx00.lightx00.server.data.util.config;

import com.google.gson.annotations.Expose;

public class CognitiveServiceConfig {
    @Expose
    private String api1;
    @Expose
    private String api2;
    @Expose
    private String endpoint;

    public String getApi1() {
        return api1;
    }

    void setApi1(String api1) {
        this.api1 = api1;
    }

    public String getApi2() {
        return api2;
    }

    void setApi2(String api2) {
        this.api2 = api2;
    }

    public String getEndpoint() {
        return endpoint;
    }

    void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
}
