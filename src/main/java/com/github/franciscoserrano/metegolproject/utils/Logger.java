package com.github.franciscoserrano.metegolproject.utils;

import org.slf4j.LoggerFactory;

public class Logger {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Logger.class);

    public static void info(String msg, Object... args) {
        Logger.LOGGER.info(msg, args);
    }

    public static void warn(String msg, Object... args) {
        Logger.LOGGER.warn(msg, args);
    }
}
