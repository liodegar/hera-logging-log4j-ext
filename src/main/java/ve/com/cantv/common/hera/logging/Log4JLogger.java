/**
 * Copyright 2004 CANTV. All rights reserved.
 * CANTV PROPRIETARY/CONFIDENTIAL. Use is subject to license
 * terms.
 * <p>
 * This software is the confidential and proprietary information
 * of CANTV. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered
 * into with CANTV.
 * <p>
 * Creation date: 2004-10-20
 * <p>
 * Changes:
 */
package ve.com.cantv.common.hera.logging;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * Class Log4JLogger
 * <p>
 * Log4JLogger Wrapper to Log4J logging framework.
 * Not used directly but through the HeraLogger class if it is configured to wrap a Log4JLogger object
 * in the hera-logging.properties file.
 *
 * @author Liodegar Bracamonte
 */
public class Log4JLogger implements UniversalLogger {
    /**
     * Log4j Logger object
     */
    private Logger logger;

    /**
     * Map used to do a mapping between the class LogLevel and the Log4j Level class
     */
    private static Map<LogLevel, Level> levels;

    /**
     * Creates a new Log4JLogger object
     *
     * @param logger Log4j Logger object
     */
    public Log4JLogger(Logger logger) {
        this.logger = logger;
    }

    /**
     * Creates a new Log4JLogger object
     *
     * @param name the logger's name
     */
    public Log4JLogger(String name) {
        this.logger = LogManager.getLogger(name);
    }

    /**
     * Creates a new Log4JLogger object using the clazz.getName() idiom
     *
     * @param clazz The class object
     */
    public Log4JLogger(Class clazz) {
        this(clazz.getName());
    }

    /**
     * Returns a Log4J Level object for a given logLevel
     *
     * @param logLevel The LogLevel object indicating the level for this log
     * @return Level
     */
    public static Level getLevel(LogLevel logLevel) {
        loadMap();
        return levels.get(logLevel);
    }

    /**
     * Loads in map the propietary logLevels with the Log4J levels counterparts
     */
    private static void loadMap() {
        if (levels == null) {
            levels = new HashMap(6);
            levels.put(LogLevel.FATAL, Level.FATAL);
            levels.put(LogLevel.ERROR, Level.ERROR);
            levels.put(LogLevel.WARN, Level.WARN);
            levels.put(LogLevel.INFO, Level.INFO);
            levels.put(LogLevel.DEBUG, Level.DEBUG);
            levels.put(LogLevel.TRACE, Level.TRACE);
        }
    }


    /**
     * Logs a message object with the <code>FATAL</code> level.
     *
     * @param message the message object to log
     */
    public void fatal(Object message) {
        log(LogLevel.FATAL, message);
    }

    /**
     * Logs a message object with the <code>FATAL</code> level including the stack trace of the Throwable parameter.
     *
     * @param message   the message object to log
     * @param throwable the exception to log, including its stack trace
     */
    public void fatal(Object message, Throwable throwable) {
        log(LogLevel.FATAL, message, throwable);
    }

    /**
     * Logs a message (only to be constructed if the logging level is the FATAL level) with the <code>FATAL</code> level including the stack trace of the Throwable parameter.
     *
     * @param message the message object to log
     */
    @Override
    public void fatal(Supplier<?> message) {
        log(LogLevel.FATAL, message);
    }

    /**
     * Logs a message (only to be constructed if the logging level is the FATAL level) with the <code>FATAL</code> level including the stack trace of the Throwable parameter.
     *
     * @param message   the message object to log
     * @param throwable the exception to log, including its stack trace
     */
    @Override
    public void fatal(Supplier<?> message, Throwable throwable) {
        log(LogLevel.FATAL, message, throwable);
    }

    /**
     * Logs a message object with the <code>ERROR</code> level.
     *
     * @param message the message object to log
     */
    public void error(Object message) {
        log(LogLevel.ERROR, message);
    }

    /**
     * Logs a message object with the <code>ERROR</code> level including the stack trace of the Throwable parameter.
     *
     * @param message   the message object to log
     * @param throwable the exception to log, including its stack trace
     */
    public void error(Object message, Throwable throwable) {
        log(LogLevel.ERROR, message, throwable);
    }

    /**
     * Logs a message (only to be constructed if the logging level is the ERROR level) with the <code>ERROR</code> level including the stack trace of the Throwable parameter.
     *
     * @param message the message object to log
     */
    @Override
    public void error(Supplier<?> message) {
        log(LogLevel.ERROR, message);
    }

    /**
     * Logs a message (only to be constructed if the logging level is the ERROR level) with the <code>ERROR</code> level including the stack trace of the Throwable parameter.
     *
     * @param message   the message object to log
     * @param throwable the exception to log, including its stack trace
     */
    @Override
    public void error(Supplier<?> message, Throwable throwable) {
        log(LogLevel.ERROR, message, throwable);
    }

    /**
     * Logs a message object with the <code>WARN</code> level.
     *
     * @param message the message object to log
     */
    public void warn(Object message) {
        log(LogLevel.WARN, message);
    }

    /**
     * Logs a message object with the <code>WARN</code> level including the stack trace of the Throwable parameter.
     *
     * @param message   the message object to log
     * @param throwable the exception to log, including its stack trace
     */
    public void warn(Object message, Throwable throwable) {
        log(LogLevel.WARN, message, throwable);
    }

    /**
     * Logs a message (only to be constructed if the logging level is the WARN level) with the <code>WARN</code> level including the stack trace of the Throwable parameter.
     *
     * @param message the message object to log
     */
    @Override
    public void warn(Supplier<?> message) {
        log(LogLevel.WARN, message);
    }

    /**
     * Logs a message (only to be constructed if the logging level is the WARN level) with the <code>WARN</code> level including the stack trace of the Throwable parameter.
     *
     * @param message   the message object to log
     * @param throwable the exception to log, including its stack trace
     */
    @Override
    public void warn(Supplier<?> message, Throwable throwable) {
        log(LogLevel.WARN, message, throwable);
    }

    /**
     * Logs a message object with the <code>INFO</code> level.
     *
     * @param message the message object to log
     */
    public void info(Object message) {
        log(LogLevel.INFO, message);
    }

    /**
     * Logs a message object with the <code>INFO</code> level including the stack trace of the Throwable parameter.
     *
     * @param message   the message object to log
     * @param throwable the exception to log, including its stack trace
     */
    public void info(Object message, Throwable throwable) {
        log(LogLevel.INFO, message, throwable);
    }

    /**
     * Logs a message (only to be constructed if the logging level is the INFO level) with the <code>INFO</code> level including the stack trace of the Throwable parameter.
     *
     * @param message the message object to log
     */
    @Override
    public void info(Supplier<?> message) {
        log(LogLevel.INFO, message);
    }

    /**
     * Logs a message (only to be constructed if the logging level is the INFO level) with the <code>INFO</code> level including the stack trace of the Throwable parameter.
     *
     * @param message   the message object to log
     * @param throwable the exception to log, including its stack trace
     */
    @Override
    public void info(Supplier<?> message, Throwable throwable) {
        log(LogLevel.INFO, message, throwable);
    }

    /**
     * Logs a message object with the <code>DEBUG</code> level.
     *
     * @param message the message object to log
     */
    public void debug(Object message) {
        log(LogLevel.DEBUG, message);
    }

    /**
     * Logs a message object with the <code>DEBUG</code> level including the stack trace of the Throwable parameter.
     *
     * @param message   the message object to log
     * @param throwable the exception to log, including its stack trace
     */
    public void debug(Object message, Throwable throwable) {
        log(LogLevel.DEBUG, message, throwable);
    }

    /**
     * Logs a message (only to be constructed if the logging level is the DEBUG level) with the <code>DEBUG</code> level including the stack trace of the Throwable parameter.
     *
     * @param message the message object to log
     */
    @Override
    public void debug(Supplier<?> message) {
        log(LogLevel.DEBUG, message);
    }

    /**
     * Logs a message (only to be constructed if the logging level is the DEBUG level) with the <code>DEBUG</code> level including the stack trace of the Throwable parameter.
     *
     * @param message   the message object to log
     * @param throwable the exception to log, including its stack trace
     */
    @Override
    public void debug(Supplier<?> message, Throwable throwable) {
        log(LogLevel.DEBUG, message, throwable);
    }

    /**
     * Logs a message object with the <code>TRACE</code> level including the stack trace of the Throwable parameter.
     *
     * @param message the message object to log
     */
    @Override
    public void trace(Object message) {
        log(LogLevel.TRACE, message);
    }

    /**
     * Logs a message (only to be constructed if the logging level is the TRACE level) with the <code>TRACE</code> level including the stack trace of the Throwable parameter.
     *
     * @param message the message object to log
     */
    @Override
    public void trace(Supplier<?> message) {
        log(LogLevel.TRACE, message);
    }

    /**
     * Logs a message object with the <code>TRACE</code> level including the stack trace of the Throwable parameter.
     *
     * @param message   the message object to log
     * @param throwable the exception to log, including its stack trace
     */
    @Override
    public void trace(Object message, Throwable throwable) {
        log(LogLevel.TRACE, message, throwable);
    }

    /**
     * Logs a message (only to be constructed if the logging level is the TRACE level) with the <code>TRACE</code> level including the stack trace of the Throwable parameter.
     *
     * @param message   the message object to log
     * @param throwable the exception to log, including its stack trace
     */
    @Override
    public void trace(Supplier<?> message, Throwable throwable) {
        log(LogLevel.TRACE, message, throwable);
    }

    /**
     * Logs a message object with the given logLevel including the stack trace of the Throwable parameter.
     *
     * @param logLevel  The LogLevel object indicating the level for this log
     * @param message   the message object to log
     * @param throwable the exception to log, including its stack trace
     */
    public void log(LogLevel logLevel, Object message, Throwable throwable) {
        this.logger.log(getLevel(logLevel), message, throwable);
    }

    /**
     * Logs a message object with the given logLevel
     *
     * @param logLevel The LogLevel object indicating the level for this log
     * @param message  the message object to log
     */
    public void log(LogLevel logLevel, Object message) {
        this.logger.log(getLevel(logLevel), message);
    }

    /**
     * Logs a message (only to be constructed if the logging level is enabled for ths level) including the stack trace of the Throwable parameter.
     *
     * @param level     The level for this log
     * @param message   the message object to log
     * @param throwable the exception to log, including its stack trace
     */
    @Override
    public void log(LogLevel level, Supplier<?> message, Throwable throwable) {
        if (isEnabled(level)) {
            log(level, message.get(), throwable);
        }
    }

    /**
     * Logs a message (only to be constructed if the logging level is enabled for ths level)
     *
     * @param level   the level for this log
     * @param message the message object to log
     */
    @Override
    public void log(LogLevel level, Supplier<?> message) {
        if (isEnabled(level)) {
            log(level, message.get());
        }
    }

    /**
     * Checks whether if this Logger is enabled for the given LogLevel
     *
     * @param logLevel the Level to check
     * @return boolean - true if this Logger is enabled for level, false otherwise.
     */
    @Override
    public boolean isEnabled(LogLevel logLevel) {
        return logger.isEnabled(getLevel(logLevel));
    }

    /**
     * Returns the logger name.
     *
     * @return the logger name
     */
    public String getName() {
        return logger.getName();
    }

    /**
     * Calling this method will <em>safely</em> close and remove all
     * appenders in all the categories including root contained in the
     * default hierachy.
     * <p>
     *
     */
    public void shutdown() {
        LogManager.shutdown();
    }
}
