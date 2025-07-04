package com.logger.core;

public class LogManager {

    private LoggerConfig loggerConfig;

    public static Logger getLogger(String packageName){
        if (packageName==null || packageName.isBlank()){
            //todo i dont know whether i throw an exception or just return null.
        }
        return new Logger(packageName);
    }

    public static Logger getLogger(String packageName,Level level,LogWriter logWriter,LogFormatter logFormatter){
        if (packageName==null || packageName.isBlank()){
            //todo i dont know whether i throw an exception or just return null.
        }
        return new Logger(packageName,level,logWriter,logFormatter);
    }

    public void configure(LoggerConfig loggerConfig){
        loggerConfig=loggerConfig;
    }


}
