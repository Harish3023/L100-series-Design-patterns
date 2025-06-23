package creational.singleton;

public class Main {
    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();
        
        // Setting configuration values
        config1.setSetting("theme", "dark");
        config1.setSetting("language", "English");
        config1.setSetting("fontSize", "14px");
        config1.setSetting("timeout", "30s");
        config1.setSetting("enableLogs", "true");

        // Reading values from the other reference
        System.out.println("Theme: " + config2.getSetting("theme"));
        System.out.println("Language: " + config2.getSetting("language"));
        System.out.println("Font Size: " + config2.getSetting("fontSize"));
        System.out.println("Timeout: " + config2.getSetting("timeout"));
        System.out.println("Enable Logs: " + config2.getSetting("enableLogs"));

        //Verify whether both references point to the same instance.
        System.out.println(config1 == config2);  

    }
}