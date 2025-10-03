package com.logger.core;

public class Logger {
    private final String packageName;
    private Level level;
    private static final LoggerContext loggerContext=LoggerContext.getInstance();

    public Logger(String packageName,Level defaultLevel) {
        this.packageName = packageName;
        this.level=defaultLevel;
    }

    public void log(Level level , String message){
        if (this.level.ordinal()>= level.ordinal()){
            LogEvent logEvent=new LogEvent(level,message);
            loggerContext.log(logEvent);
        }
    }


    //todo im gonna add info trace debug ... to it in future.
}
