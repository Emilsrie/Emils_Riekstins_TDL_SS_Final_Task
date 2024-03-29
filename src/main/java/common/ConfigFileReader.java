package common;

import java.io.*;
import java.util.Properties;

public class ConfigFileReader {
    private Properties properties;
    private final String propertiesFilePath =
            "src" + File.separator +
            "main" + File.separator +
            "resources" + File.separator +
            "configs" + File.separator +
            "config.properties";

    public ConfigFileReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertiesFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            }
            catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
        catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertiesFilePath);
        }
    }



    public String getUrl() {
        String url = properties.getProperty("url");
        if (url != null) {
            return url;
        } else {
            throw new RuntimeException("url is not specified in the config.properties file");
        }
    }

    public String getUrl2() {
        String url = properties.getProperty("url2");
        if (url != null) {
            return url;
        } else {
            throw new RuntimeException("url2 is not specified in the config.properties file");
        }
    }

    public String getFullName() {
        String fullname = properties.getProperty("author.fullname");
        if (fullname != null) {
            return fullname;
        } else {
            throw new RuntimeException("author.fullname is not specified in the config.properties file");
        }
    }

    public String getName() {
        String name = properties.getProperty("author.name");
        if (name != null) {
            return name;
        } else {
            throw new RuntimeException("author.name is not specified in the config.properties file");
        }
    }

    public String getSurname() {
        String surname = properties.getProperty("author.surname");
        if (surname != null) {
            return surname;
        } else {
            throw new RuntimeException("author.surname is not specified in the config.properties file");
        }
    }

    public String getEmail() {
        String envPath = properties.getProperty("author.email");
        if (envPath != null) {
            return envPath;
        } else {
            throw new RuntimeException("author.email is not specified in the config.properties file");
        }
    }

    public String getEnvironment() {
        String envPath = properties.getProperty("environment.name");
        if (envPath != null) {
            return envPath;
        } else {
            throw new RuntimeException("environment.name is not specified in the config.properties file");
        }
    }

    public String getPassword() {
        String envPath = properties.getProperty("password");
        if (envPath != null) {
            return envPath;
        } else {
            throw new RuntimeException("password is not specified in the config.properties file");
        }
    }
}
