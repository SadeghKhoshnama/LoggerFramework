package com.logger.core;

import java.io.Reader;

public class Main {
//
    static {
        LoggerConfig loggerConfig=new LoggerConfig()
                .setDefaultLevel(Level.TRACE)
                .setLogWriter(new FileLogWriter("logger3",new DefaultLogFormatter(),true));
        LogManager.initialize(loggerConfig);
    }
    private static final Logger logger=LogManager.getLogger("com.logger.core");

    public static void main(String[] args) {
        LogManager.setLevel(logger.getPackageName(),Level.ERROR);
        logger.trace("Hello Im Sadegh");
        logger.info("Hello Im Infoooooo");
        logger.warn("Hello im Warnnnnnn");
        logger.error("Hello Im Errorrrrrr");
        logger.fatal("Hello Im Fatalllllll");
        logger.debug("Hello Im Debugggggg");
        logger.debug("Connection for database is Okay error code Is:  %d",200);
    }
}
