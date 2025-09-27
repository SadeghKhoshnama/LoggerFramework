package com.logger.core;

import com.logger.appender.Appender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingQueue;

public class LogManager {
    private static final LoggerContext loggerContext= LoggerContext.getInstance();

    public static Logger getLogger(String packageName,Level level){
        if (packageName==null || packageName.isEmpty()){
            throw new IllegalArgumentException("packageName is null.");
        }
        return loggerContext.getLogger(packageName,level);
    }


//    public static Logger getLogger(Class<?> clazz){
//        return getLogger(clazz);
//    }

    public static void setLevel(String packageName,Level level){
        //todo your gonna search inside the hashmap find the logger and then set the level to
        //todo the level you want from parameter.
        //todo and then return.
    }




}
