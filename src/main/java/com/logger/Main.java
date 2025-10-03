package com.logger;

import com.logger.core.Level;
import com.logger.core.LogManager;
import com.logger.core.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger= LogManager.getLogger("com.logger.core", Level.INFO);
        logger.log(Level.INFO,"Hello");
        logger.log(Level.INFO,"Hi");
//        LogManager.addAppenders(new ConsoleAppender(new SimpleLogFormatter()));
//        logger.log(Level.TRACE,"This is TRACE");
//        logger.log(Level.DEBUG,"This is DEBUG");
//        logger.log(Level.INFO,"This is INFO");
//        logger.log(Level.WARN,"This is WARN");
//        logger.log(Level.ERROR,"This is ERROR");
//        logger.log(Level.FATAL,"This is FATAL");
    }
}
