package com.logger.core;

import java.util.HashMap;
import java.util.Map;

public class LogManager {

    private static LoggerConfig loggerConfig=null;
    private static LogWriter logWriter;
    private static final Map<String,Logger> logObjects=new HashMap<>();

    public static Logger getLogger(String packageName){
        if (loggerConfig==null){
            ensureLoggerInitialization();
        }
        Logger logger=new Logger(packageName,loggerConfig.getDefaultLevel());
        logObjects.put(packageName,logger);
        return logger;
    }

    public static LogWriter getLogWriter(){
        return logWriter;
    }

    public static void initialize(LoggerConfig config){
        loggerConfig=config;
        logWriter=config.getLogWriter();
    }


    public static void setLevel(String packageName,Level level){
        Logger targetLogger=logObjects.get(packageName);
        if (targetLogger==null)
            throw new RuntimeException("There is no active logger inside this package");
        targetLogger.setLevel(level);
        logObjects.put(packageName,targetLogger);//todo i dont know if its a good way to do it Jim.
    }

    //helper method
    private static void ensureLoggerInitialization(){
        if (loggerConfig==null){
            LogFormatter logFormatter=new DefaultLogFormatter();
            logWriter=new ConsoleLogWriter(new DefaultLogFormatter());
            loggerConfig=new LoggerConfig()
                    .setDefaultLevel(Level.INFO)
                    .setLogWriter(new ConsoleLogWriter(logFormatter));
        }
    }
}
