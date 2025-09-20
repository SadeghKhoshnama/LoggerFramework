package com.logger.core;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class LogManager {
    private static final Map<String,Logger> loggers=new HashMap<>();
    private static final BlockingQueue<LogEvent> events=new LinkedBlockingQueue<>();
    private static final List<Appender> appendersList=new ArrayList<>();
     //todo im gonna fix this when i put config from users.


    public static void addAppenders(Appender ... appenders){
        appendersList.addAll(Arrays.asList(appenders)); //todo check this Jim.
    }

    public static Logger getLogger(String packageName){
        if (loggers.get(packageName)==null){
            Logger logger=new Logger(packageName,Level.INFO);
            loggers.put(packageName,logger);
            return logger;
        }
     return loggers.get(packageName);
    }


    public static Logger getLogger(Class clazz){
        if (loggers.get(clazz.getPackageName())==null){
            Logger logger=new Logger(clazz.getPackageName(),Level.INFO);
            loggers.put(clazz.getPackageName(),logger);
            return logger;
        }
        return loggers.get(clazz.getPackageName());
    }

    public static void log(Level level,String message){
        //it should create background thread and put it inside queue of logEvents.
        LogEvent logEvent=new LogEvent(level,message);
        try {
            events.put(logEvent);
        }catch (InterruptedException e){
         //todo i will handle this in the future
        }
        Thread writerThread=new Thread(()->{
            while (!events.isEmpty()){
                for (Appender appender: appendersList){
                    appender.write(logEvent);
                }
            }
        });
        writerThread.start();
    }
}
