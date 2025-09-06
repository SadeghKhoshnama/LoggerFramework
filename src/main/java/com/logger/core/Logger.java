package com.logger.core;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logger {
    private List<Appender> appenders;
    private final String packageName;

    public Logger(String packageName) {
        this.packageName = packageName;
        appenders=new ArrayList<>();
    }


    public void putAppenders(Appender... appender){
        appenders.addAll(Arrays.asList(appender));
    }

    public void log(Level level , String message){
        LogEvent logEvent=new LogEvent(level,message,
                LocalDateTime.now(),Thread.currentThread().getName(),packageName);
        for (Appender a: appenders) a.write(logEvent);
    }
}
