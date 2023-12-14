package hu.masterfield.utils;

import hu.masterfield.testcases.BaseTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * A config.properties file felolvasast vegzo osztaly
 */
public class ConfigData extends Properties {

    protected static Logger logger = LogManager.getLogger(ConfigData.class);

    public ConfigData() {
        InputStream is = BaseTest.class.getResourceAsStream(Consts.CONFIG_PROPERTIES);
        try {
            load(is);
        } catch (IOException ex) {
            logger.warn("Exception" + Consts.CONFIG_PROPERTIES +
                    " try to load. " + ex.getMessage());
            throw new RuntimeException(ex);
        }
        logger.info(Consts.CONFIG_PROPERTIES + " loaded...");
    }
}
