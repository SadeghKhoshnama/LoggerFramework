package com.logger.core;

public class LogManager {

    private static LoggerConfig loggerConfig=null;
    private static LogWriter logWriter;

    public static Logger getLogger(String packageName){
        if (loggerConfig==null){
            ensureLoggerInitialization();
        }
        return new Logger(packageName);
    }

    public static LogWriter getLogWriter(){
        return logWriter;
    }

    public static void initialize(LoggerConfig config){
        loggerConfig=config;
        logWriter=config.getLogWriter();
    }


    public static void setLevel(Level level){
        if (loggerConfig==null) ensureLoggerInitialization();
        loggerConfig.setLevel(level);
    }

    public static Level getLevel(){
        if (loggerConfig==null) ensureLoggerInitialization();
        return loggerConfig.getLevel();
    }

    //helper method
    private static void ensureLoggerInitialization(){
        if (loggerConfig==null){
            LogFormatter logFormatter=new DefaultLogFormatter();
            logWriter=new ConsoleLogWriter(new DefaultLogFormatter());
            loggerConfig=new LoggerConfig()
                    .setLevel(Level.TRACE)
                    .setLogWriter(new ConsoleLogWriter(logFormatter));
        }
    }
}
