package ve.com.cantv.common.hera.logging;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.*;

/**
 * This class is intended to test the proper functionality of Log4JLogger class
 * Created by Liodegar on 10/21/2018.
 */
@RunWith(MockitoJUnitRunner.class)
public class Log4JLoggerTest {

    @Mock
    private Logger logger;

    @InjectMocks
    private Log4JLogger systemUnderTest;

    // --------------------------------------------------  Trace level  ------------------------------------------------
    @Test
    public void logTraceMessage() {
        //given
        Object message = "Hello World!"; //I need to call log(Level level, Object var2) instead of log(Level level, CharSequence var2)

        //when
        systemUnderTest.log(LogLevel.TRACE, message);

        //then
        verify(logger, times(1)).log(eq(Level.TRACE), eq(message));
    }

    @Test
    public void logTraceMessageWithException() {
        //given
        Exception exception = new IllegalArgumentException("The param is invalid");
        Object message = "Hello World!";

        //when
        systemUnderTest.log(LogLevel.TRACE, message, exception);

        //then
        verify(logger, times(1)).log(eq(Level.TRACE), eq(message), eq(exception));
    }


    @Test
    public void logTraceSupplierLogEnabled() {
        //given
        Object message = "Hello World!";

        //when
        doReturn(true).when(logger).isEnabled(eq(Level.TRACE));
        systemUnderTest.log(LogLevel.TRACE, () -> message);

        //then
        verify(logger, times(1)).log(eq(Level.TRACE), eq(message));
    }

    @Test
    public void logTraceSupplierLogDisabled() {
        //given
        Object message = "Hello World!";

        //when
        doReturn(false).when(logger).isEnabled(eq(Level.TRACE));
        systemUnderTest.log(LogLevel.TRACE, () -> message);

        //then
        verify(logger, never()).log(eq(Level.TRACE), eq(message));
    }


    @Test
    public void logTraceSupplierWithExceptionLogEnabled() {
        Exception exception = new IllegalArgumentException("The param is invalid");
        Object message = "Hello World!";

        //when
        doReturn(true).when(logger).isEnabled(eq(Level.TRACE));
        systemUnderTest.log(LogLevel.TRACE, () -> message, exception);

        //then
        verify(logger, times(1)).log(eq(Level.TRACE), eq(message), eq(exception));
    }

    @Test
    public void logTraceSupplierWithExceptionLogDisabled() {
        Exception exception = new IllegalArgumentException("The param is invalid");
        Object message = "Hello World!";

        //when
        doReturn(false).when(logger).isEnabled(eq(Level.TRACE));
        systemUnderTest.log(LogLevel.TRACE, () -> message, exception);

        //then
        verify(logger, never()).log(eq(Level.TRACE), eq(message), eq(exception));
    }


    // --------------------------------------------------  Debug level  ------------------------------------------------
    @Test
    public void logDebugMessage() {
        //given
        Object message = "Hello World!"; //I need to call log(Level level, Object var2) instead of log(Level level, CharSequence var2)

        //when
        systemUnderTest.log(LogLevel.DEBUG, message);

        //then
        verify(logger, times(1)).log(eq(Level.DEBUG), eq(message));
    }

    @Test
    public void logDebugMessageWithException() {
        //given
        Exception exception = new IllegalArgumentException("The param is invalid");
        Object message = "Hello World!";

        //when
        systemUnderTest.log(LogLevel.DEBUG, message, exception);

        //then
        verify(logger, times(1)).log(eq(Level.DEBUG), eq(message), eq(exception));
    }


    @Test
    public void logDebugSupplierLogEnabled() {
        //given
        Object message = "Hello World!";

        //when
        doReturn(true).when(logger).isEnabled(eq(Level.DEBUG));
        systemUnderTest.log(LogLevel.DEBUG, () -> message);

        //then
        verify(logger, times(1)).log(eq(Level.DEBUG), eq(message));
    }

    @Test
    public void logDebugSupplierLogDisabled() {
        //given
        Object message = "Hello World!";

        //when
        doReturn(false).when(logger).isEnabled(eq(Level.DEBUG));
        systemUnderTest.log(LogLevel.DEBUG, () -> message);

        //then
        verify(logger, never()).log(eq(Level.DEBUG), eq(message));
    }


    @Test
    public void logDebugSupplierWithExceptionLogEnabled() {
        Exception exception = new IllegalArgumentException("The param is invalid");
        Object message = "Hello World!";

        //when
        doReturn(true).when(logger).isEnabled(eq(Level.DEBUG));
        systemUnderTest.log(LogLevel.DEBUG, () -> message, exception);

        //then
        verify(logger, times(1)).log(eq(Level.DEBUG), eq(message), eq(exception));
    }

    @Test
    public void logDebugSupplierWithExceptionLogDisabled() {
        Exception exception = new IllegalArgumentException("The param is invalid");
        Object message = "Hello World!";

        //when
        doReturn(false).when(logger).isEnabled(eq(Level.DEBUG));
        systemUnderTest.log(LogLevel.DEBUG, () -> message, exception);

        //then
        verify(logger, never()).log(eq(Level.DEBUG), eq(message), eq(exception));
    }


    // --------------------------------------------------  Info level  -------------------------------------------------
    @Test
    public void logInfoMessage() {
        //given
        Object message = "Hello World!"; //I need to call log(Level level, Object var2) instead of log(Level level, CharSequence var2)

        //when
        systemUnderTest.log(LogLevel.INFO, message);

        //then
        verify(logger, times(1)).log(eq(Level.INFO), eq(message));
    }

    @Test
    public void logInfoMessageWithException() {
        //given
        Exception exception = new IllegalArgumentException("The param is invalid");
        Object message = "Hello World!";

        //when
        systemUnderTest.log(LogLevel.INFO, message, exception);

        //then
        verify(logger, times(1)).log(eq(Level.INFO), eq(message), eq(exception));
    }


    @Test
    public void logInfoSupplierLogEnabled() {
        //given
        Object message = "Hello World!";

        //when
        doReturn(true).when(logger).isEnabled(eq(Level.INFO));
        systemUnderTest.log(LogLevel.INFO, () -> message);

        //then
        verify(logger, times(1)).log(eq(Level.INFO), eq(message));
    }

    @Test
    public void logInfoSupplierLogDisabled() {
        //given
        Object message = "Hello World!";

        //when
        doReturn(false).when(logger).isEnabled(eq(Level.INFO));
        systemUnderTest.log(LogLevel.INFO, () -> message);

        //then
        verify(logger, never()).log(eq(Level.INFO), eq(message));
    }


    @Test
    public void logInfoSupplierWithExceptionLogEnabled() {
        Exception exception = new IllegalArgumentException("The param is invalid");
        Object message = "Hello World!";

        //when
        doReturn(true).when(logger).isEnabled(eq(Level.INFO));
        systemUnderTest.log(LogLevel.INFO, () -> message, exception);

        //then
        verify(logger, times(1)).log(eq(Level.INFO), eq(message), eq(exception));
    }

    @Test
    public void logInfoSupplierWithExceptionLogDisabled() {
        Exception exception = new IllegalArgumentException("The param is invalid");
        Object message = "Hello World!";

        //when
        doReturn(false).when(logger).isEnabled(eq(Level.INFO));
        systemUnderTest.log(LogLevel.INFO, () -> message, exception);

        //then
        verify(logger, never()).log(eq(Level.INFO), eq(message), eq(exception));
    }


    // --------------------------------------------------  Warn level  -------------------------------------------------
    @Test
    public void logWarnMessage() {
        //given
        Object message = "Hello World!"; //I need to call log(Level level, Object var2) instead of log(Level level, CharSequence var2)

        //when
        systemUnderTest.log(LogLevel.WARN, message);

        //then
        verify(logger, times(1)).log(eq(Level.WARN), eq(message));
    }

    @Test
    public void logWarnMessageWithException() {
        //given
        Exception exception = new IllegalArgumentException("The param is invalid");
        Object message = "Hello World!";

        //when
        systemUnderTest.log(LogLevel.WARN, message, exception);

        //then
        verify(logger, times(1)).log(eq(Level.WARN), eq(message), eq(exception));
    }


    @Test
    public void logWarnSupplierLogEnabled() {
        //given
        Object message = "Hello World!";

        //when
        doReturn(true).when(logger).isEnabled(eq(Level.WARN));
        systemUnderTest.log(LogLevel.WARN, () -> message);

        //then
        verify(logger, times(1)).log(eq(Level.WARN), eq(message));
    }

    @Test
    public void logWarnSupplierLogDisabled() {
        //given
        Object message = "Hello World!";

        //when
        doReturn(false).when(logger).isEnabled(eq(Level.WARN));
        systemUnderTest.log(LogLevel.WARN, () -> message);

        //then
        verify(logger, never()).log(eq(Level.WARN), eq(message));
    }


    @Test
    public void logWarnSupplierWithExceptionLogEnabled() {
        Exception exception = new IllegalArgumentException("The param is invalid");
        Object message = "Hello World!";

        //when
        doReturn(true).when(logger).isEnabled(eq(Level.WARN));
        systemUnderTest.log(LogLevel.WARN, () -> message, exception);

        //then
        verify(logger, times(1)).log(eq(Level.WARN), eq(message), eq(exception));
    }

    @Test
    public void logWarnSupplierWithExceptionLogDisabled() {
        Exception exception = new IllegalArgumentException("The param is invalid");
        Object message = "Hello World!";

        //when
        doReturn(false).when(logger).isEnabled(eq(Level.WARN));
        systemUnderTest.log(LogLevel.WARN, () -> message, exception);

        //then
        verify(logger, never()).log(eq(Level.WARN), eq(message), eq(exception));
    }


    // --------------------------------------------------  Error level  ------------------------------------------------
    @Test
    public void logErrorMessage() {
        //given
        Object message = "Hello World!"; //I need to call log(Level level, Object var2) instead of log(Level level, CharSequence var2)

        //when
        systemUnderTest.log(LogLevel.ERROR, message);

        //then
        verify(logger, times(1)).log(eq(Level.ERROR), eq(message));
    }

    @Test
    public void logErrorMessageWithException() {
        //given
        Exception exception = new IllegalArgumentException("The param is invalid");
        Object message = "Hello World!";

        //when
        systemUnderTest.log(LogLevel.ERROR, message, exception);

        //then
        verify(logger, times(1)).log(eq(Level.ERROR), eq(message), eq(exception));
    }


    @Test
    public void logErrorSupplierLogEnabled() {
        //given
        Object message = "Hello World!";

        //when
        doReturn(true).when(logger).isEnabled(eq(Level.ERROR));
        systemUnderTest.log(LogLevel.ERROR, () -> message);

        //then
        verify(logger, times(1)).log(eq(Level.ERROR), eq(message));
    }

    @Test
    public void logErrorSupplierLogDisabled() {
        //given
        Object message = "Hello World!";

        //when
        doReturn(false).when(logger).isEnabled(eq(Level.ERROR));
        systemUnderTest.log(LogLevel.ERROR, () -> message);

        //then
        verify(logger, never()).log(eq(Level.ERROR), eq(message));
    }


    @Test
    public void logErrorSupplierWithExceptionLogEnabled() {
        Exception exception = new IllegalArgumentException("The param is invalid");
        Object message = "Hello World!";

        //when
        doReturn(true).when(logger).isEnabled(eq(Level.ERROR));
        systemUnderTest.log(LogLevel.ERROR, () -> message, exception);

        //then
        verify(logger, times(1)).log(eq(Level.ERROR), eq(message), eq(exception));
    }

    @Test
    public void logErrorSupplierWithExceptionLogDisabled() {
        Exception exception = new IllegalArgumentException("The param is invalid");
        Object message = "Hello World!";

        //when
        doReturn(false).when(logger).isEnabled(eq(Level.ERROR));
        systemUnderTest.log(LogLevel.ERROR, () -> message, exception);

        //then
        verify(logger, never()).log(eq(Level.ERROR), eq(message), eq(exception));
    }


    // --------------------------------------------------  Fatal level  ------------------------------------------------
    @Test
    public void logFatalMessage() {
        //given
        Object message = "Hello World!"; //I need to call log(Level level, Object var2) instead of log(Level level, CharSequence var2)

        //when
        systemUnderTest.log(LogLevel.FATAL, message);

        //then
        verify(logger, times(1)).log(eq(Level.FATAL), eq(message));
    }

    @Test
    public void logFatalMessageWithException() {
        //given
        Exception exception = new IllegalArgumentException("The param is invalid");
        Object message = "Hello World!";

        //when
        systemUnderTest.log(LogLevel.FATAL, message, exception);

        //then
        verify(logger, times(1)).log(eq(Level.FATAL), eq(message), eq(exception));
    }


    @Test
    public void logFatalSupplierLogEnabled() {
        //given
        Object message = "Hello World!";

        //when
        doReturn(true).when(logger).isEnabled(eq(Level.FATAL));
        systemUnderTest.log(LogLevel.FATAL, () -> message);

        //then
        verify(logger, times(1)).log(eq(Level.FATAL), eq(message));
    }

    @Test
    public void logFatalSupplierLogDisabled() {
        //given
        Object message = "Hello World!";

        //when
        doReturn(false).when(logger).isEnabled(eq(Level.FATAL));
        systemUnderTest.log(LogLevel.FATAL, () -> message);

        //then
        verify(logger, never()).log(eq(Level.FATAL), eq(message));
    }


    @Test
    public void logFatalSupplierWithExceptionLogEnabled() {
        Exception exception = new IllegalArgumentException("The param is invalid");
        Object message = "Hello World!";

        //when
        doReturn(true).when(logger).isEnabled(eq(Level.FATAL));
        systemUnderTest.log(LogLevel.FATAL, () -> message, exception);

        //then
        verify(logger, times(1)).log(eq(Level.FATAL), eq(message), eq(exception));
    }

    @Test
    public void logFatalSupplierWithExceptionLogDisabled() {
        Exception exception = new IllegalArgumentException("The param is invalid");
        Object message = "Hello World!";

        //when
        doReturn(false).when(logger).isEnabled(eq(Level.FATAL));
        systemUnderTest.log(LogLevel.FATAL, () -> message, exception);

        //then
        verify(logger, never()).log(eq(Level.FATAL), eq(message), eq(exception));
    }
}
