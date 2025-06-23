package creational.singleton;
import java.util.*;

// Singleton class
public class ConfigurationManager {
    private static volatile ConfigurationManager instance;
    private Map<String, String> settings;

    private ConfigurationManager() {
        settings = new HashMap<>();
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public String getSetting(String key) {
        return settings.get(key);
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }
}

