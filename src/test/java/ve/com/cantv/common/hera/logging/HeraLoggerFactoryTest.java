package ve.com.cantv.common.hera.logging;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 * Created by Liodegar on 10/21/2018.
 */
public class HeraLoggerFactoryTest {

    /**
     * This test validates that Hera logging is using Log4JLogger properly
     * @throws Exception if any error is encountered
     */
    @Test
    public void validateWrappedLoggerIsLog4JLogger() throws Exception {
        HeraLogger heraLogger = HeraLoggerFactory.getLogger("myClass");

        Field f = HeraLogger.class.getDeclaredField("logger");
        f.setAccessible(true);
        Object logger = f.get(heraLogger);

        Assert.assertNotNull(heraLogger);
        Assert.assertEquals(logger.getClass(), Log4JLogger.class);
    }

}
