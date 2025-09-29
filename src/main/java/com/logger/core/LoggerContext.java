package com.logger.core;

import com.logger.appender.Appender;
import com.logger.appender.ConsoleAppender;
import com.logger.formatter.SimpleLogFormatter;

import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class LoggerContext {
    private static LoggerContext instance;
    private final Map<String,Logger> loggers=new ConcurrentHashMap<>();
    private final List<Appender> appenders=new CopyOnWriteArrayList<>();
    private final BlockingQueue<LogEvent> logEvents=new LinkedBlockingQueue<>();
    private static final Object lock=new Object();

    private LoggerContext(){
        //todo have to know how to add appenders.
        appenders.add(new ConsoleAppender(new SimpleLogFormatter()));
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        LogEvent logEvent= logEvents.take();
                        for (Appender appender: appenders){
                            appender.write(logEvent);
                        }
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        //todo how to find a way to add appenders.
    }

    //getting object with getInstance and also i made it thread safe. to not have two objects.
    public static LoggerContext getInstance(){
        if (instance==null){
            synchronized (lock){
                if (instance==null){
                    instance=new LoggerContext();
                }
            }
        }
        return instance;
    }
    public Logger getLogger(String packageName,Level level){
        if (loggers.get(packageName)!=null){
            return loggers.get(packageName);
        }
        Logger logger=new Logger(packageName,level);
        loggers.put(packageName,logger);
        return new Logger(packageName,level);
    }


//    public Logger getLogger(Class<?> clazz){
//        String packageName= clazz.getPackageName();
//        return getLogger(packageName,Level.INFO); //if user dont specify level im gonna put INFO.
//    }


    public void log(LogEvent logEvent){
        try {
            logEvents.add(logEvent);
        }catch (RuntimeException e){
            e.printStackTrace(); //todo i will handle this properly.
        }
    }



}
