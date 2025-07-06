package com.logger.core;

public class Main {

    private static Logger logger;
    static {
        LoggerConfig loggerConfig=new LoggerConfig()
                .setLevel(Level.ERROR)
                .setLogWriter(new ConsoleLogWriter())
                .setFormatter(new DefaultLogFormatter());
        LogManager.configure(loggerConfig);
        logger=LogManager.getLogger("com.logger");
    }





    public static void main(String[] args) {
        logger.info("Hello Im Sadegh");
        logger.info("Yeah it has been written into the file");
        logger.info("This is Awesome");
        logger.error("Yeahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh %s","sadegh");
        logger.error("Connection for database is Okay error code Is:  %d",200);
        logger.fatal("Fatality happen %s %s %s %s","Iran","US","Taiwan","UK");
        logger.debug("Debugging");
    }
}
