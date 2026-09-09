package rhit;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class PropertiesLoader {
  private static final String FILE_NAME = "Strings.properties";
  private static final PropertiesLoader instance = new PropertiesLoader();
  private final Properties properties = new Properties();

  private PropertiesLoader() {
    try (InputStream input = getClass().getClassLoader().getResourceAsStream(FILE_NAME)) {
      if (input == null) {
        throw new IllegalStateException("Could not find properties file " + FILE_NAME);
      }
      properties.load(input);
    } catch (IOException ex) {
      throw new IllegalStateException("Could not load properties file " + FILE_NAME, ex);
    }
  }

  static String get(String key) {
    return instance.getProperty(key);
  }

  private String getProperty(String key) {
    String property = properties.getProperty(key);
    if (property == null) {
      throw new IllegalStateException("Property with key " + key + " is not defined");
    }
    return property;
  }
}
