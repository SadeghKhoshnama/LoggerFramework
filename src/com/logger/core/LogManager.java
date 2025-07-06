package com.logger.core;

public class LogManager {

    private static LoggerConfig loggerConfig=null;

    public static Logger getLogger(String packageName){
        if (packageName==null || packageName.isBlank()){
            //todo i dont know whether i throw an exception or just return null.
        }
        if (loggerConfig==null){
            return new Logger(packageName);
        }
        return new Logger(packageName,loggerConfig.getLevel(),
                loggerConfig.getLogWriter(), loggerConfig.getFormatter());
    }


    public static void configure(LoggerConfig loggerConfig){
        LogManager.loggerConfig=loggerConfig;
    }



    //todo i think this is not needed anymore Jim.
//    public static Logger getLogger(String packageName,Level level,LogWriter logWriter,LogFormatter logFormatter){
//        if (packageName==null || packageName.isBlank()){
//            //todo i dont know whether i throw an exception or just return null.
//        }
//        return new Logger(packageName,level,logWriter,logFormatter);
//    }





}
