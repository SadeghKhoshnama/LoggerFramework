package com.logger.core;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logger {
    private final List<Appender> appenders;
    private final String packageName;
    private Level level;

    public Logger(String packageName,Level level) {
        this.packageName = packageName;
        this.level=level;
        appenders=new ArrayList<>();
    }


    public void putAppenders(Appender... appender){
        appenders.addAll(Arrays.asList(appender));
    }

    public void log(Level level , String message){
        LogEvent logEvent=new LogEvent(level,message,
                LocalDateTime.now(),Thread.currentThread().getName(),packageName);
        if (level.getPriority()>= this.level.getPriority()){
            for (Appender a: appenders) a.write(logEvent);
        }
        //do nothing.
    }
}
