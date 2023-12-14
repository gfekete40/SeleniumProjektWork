package hu.masterfield.utils;

import hu.masterfield.testcases.BaseTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * A globalTestData.properties feolvasasa
 */
public class GlobalTestData extends Properties {
    protected static Logger logger = LogManager.getLogger(GlobalTestData.class);

    public GlobalTestData() {
        InputStream is = BaseTest.class.getResourceAsStream(Consts.GLOBAL_TEST_DATA_PROPERTIES);
        try {
            load(is);
        } catch (IOException ex) {
            logger.warn("Exception" + Consts.GLOBAL_TEST_DATA_PROPERTIES +
                    " try to load. " + ex.getMessage());
            throw new RuntimeException(ex);
        }
        logger.info(Consts.GLOBAL_TEST_DATA_PROPERTIES + " loaded....");
    }
}