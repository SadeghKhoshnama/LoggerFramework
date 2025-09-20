package com.logger.core;

public class Main {
    public static void main(String[] args) {
        Logger logger=LogManager.getLogger("com.logger.core",Level.FATAL);
        LogManager.addAppenders(new ConsoleAppender(new SimpleLogFormatter()));
        logger.log(Level.TRACE,"This is TRACE");
        logger.log(Level.DEBUG,"This is DEBUG");
        logger.log(Level.INFO,"This is INFO");
        logger.log(Level.WARN,"This is WARN");
        logger.log(Level.ERROR,"This is ERROR");
        logger.log(Level.FATAL,"This is FATAL");
    }
}
