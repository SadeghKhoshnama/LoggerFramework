package com.logger.core;

public class Main {
    private static final Logger logger=LogManager.getLogger("com.logger.core");
    static {
        LoggerConfig loggerConfig=new LoggerConfig()
                .setLogWriter(new FileLogWriter("logger1",new DefaultLogFormatter(),true))
                .setLevel(Level.TRACE);
        LogManager.initialize(loggerConfig);
    }

    public static void main(String[] args) {
        logger.trace("Hello Im Sadegh");
        logger.trace("Yeah it has been written into the file");
        logger.trace("This is Awesome");
        logger.trace("Connection for database is Okay error code Is:  %d",200);
    }
}
