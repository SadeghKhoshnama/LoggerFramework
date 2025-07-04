package com.logger.core;

public class Main {

//    private static final Logger logger
//            =LogManager.getLogger("com.logger.core",Level.INFO
//            ,new FileLogWriter("logger",false),new DefaultLogFormatter());
    private static Logger logger=LogManager.getLogger("com.logger.core");

    public static void main(String[] args) {
        logger.info("Hello Im Sadegh");
        logger.info("Yeah it has been written into the file");
        logger.info("This is Awesome");
        logger.error("Yeahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh %s","sadegh");
        logger.error("Connection for database is Okay error code Is:  %d",200);
        logger.fatal("Fatality happen %s %s %s %s","Iran","US","Taiwan","UK");
    }
}
