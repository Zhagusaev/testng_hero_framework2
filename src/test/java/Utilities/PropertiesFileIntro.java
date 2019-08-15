package Utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.Properties;

public class PropertiesFileIntro {

    private final static Logger LOG = LoggerFactory.getLogger(PropertiesFileIntro.class);

    public static String getValue(String key)throws IOException {
       //Identifies file
        File file = new File("src/test/resources/credentials.properties");
       //Go and read... It reads in binary
        FileInputStream inputStream = new FileInputStream(file);

        //Properties transform binary to readable file
        Properties properties = new Properties();
        properties.load(inputStream);
//        System.out.println("we are testing in "+properties.getProperty(key));

        return properties.getProperty(key);
    }

    public static void main(String[] args) throws Exception{
       String login= getValue("login");
        System.out.println(login);

//        LOG.trace("Logging TRACE level");
//        LOG.debug("Logging DEBUG level");
//        LOG.info("Logging ERROR level");
//        LOG.info("Logging INFO level");
//        LOG.info("Logging WARN level");
    }


}
