package com.logger.core;

public class Main {
    private static final Logger logger=LogManager.newLogger("com.logger.core","resources/config.properties");
    public static void main(String[] args) {
        LogManager.setLevel(logger.getPackageName(),Level.DEBUG);
        logger.trace("Hello Im Sadegh");
        logger.info("Hello Im Infoooooo");
        logger.warn("Hello im Warnnnnnn");
        logger.error("Hello Im Errorrrrrr");
        logger.fatal("Hello Im Fatalllllll");
        logger.debug("Hello Im Debugggggg");
        logger.debug("Connection for database is Okay error code Is:  %d",200);

    }
}
