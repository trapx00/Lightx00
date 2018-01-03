package trapx00.lightx00.server.data.util.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.stream.JsonReader;
import trapx00.lightx00.server.data.util.IOUtil;
import trapx00.lightx00.shared.exception.faceid.FileException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class Config {

    @Expose
    private CognitiveServiceConfig cognitiveServiceConfig;

    @Expose
    private LogBackupConfig logBackupConfig;


    private static Config config;

    public static Config getConfig() {
        if (config != null) {
            return config;
        }


        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();

        File configFile = new File(IOUtil.getFilePathUnderRootDirOfJarFileOrClassDir("/misc/config.json"));
        try {
            config = gson.fromJson(new JsonReader(new FileReader(configFile)),Config.class);
            return config;
        } catch (FileNotFoundException e) {
            throw new FileException(e);
        }
    }

    public CognitiveServiceConfig getCognitiveServiceConfig() {
        return cognitiveServiceConfig;
    }

    public LogBackupConfig getLogBackupConfig() {
        return logBackupConfig;
    }
}
