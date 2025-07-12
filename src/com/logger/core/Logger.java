package com.logger.core;

import static com.logger.core.Level.*;

public class Logger {
    private String packageName;
    private Level level;

     Logger(String packageName) {
        this.packageName=packageName;
    }

     Logger(String packageName,Level level){
         this.packageName=packageName;
         this.level=level;
     }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public void trace(String message){
        if (TRACE.ordinal()>=level.ordinal()){
            LogManager.getLogWriter().write(TRACE,message,getPackageName());
        }

    }

    public void trace(String message,Object... args){
        if (TRACE.ordinal()>=getLevel().ordinal()){
            String formated= String.format(message,args);
            LogManager.getLogWriter().write(TRACE,formated,getPackageName());
        }

    }

    public void debug(String message){
        if (DEBUG.ordinal()>=getLevel().ordinal()){
            LogManager.getLogWriter().write(DEBUG,message,packageName);
        }
    }

    public void debug(String message,Object... args){
        if (DEBUG.ordinal()>=getLevel().ordinal()){
            String formated=String.format(message,args);
            LogManager.getLogWriter().write(DEBUG,formated,packageName);
        }
    }

    public void info(String message){
        if (INFO.ordinal()>=level.ordinal()){
            LogManager.getLogWriter().write(INFO,message,packageName);
        }
    }

    public void info(String message,Object ... args){
        if (INFO.ordinal()>=level.ordinal()){
            String formated=String.format(message,args);
            LogManager.getLogWriter().write(INFO,formated,packageName);
        }
    }


    public void warn(String message){
        if (WARN.ordinal()>=level.ordinal()){
            LogManager.getLogWriter().write(WARN,message,packageName);
        }
    }

    public void warn(String message,Object... args){
        if (WARN.ordinal()>=level.ordinal()){
            String formated=String.format(message,args);
            LogManager.getLogWriter().write(WARN,formated,packageName);
        }
    }

    public void error(String message){
        if (ERROR.ordinal()>=level.ordinal()){
            LogManager.getLogWriter().write(ERROR,message,packageName);
        }
    }

    public void error(String message,Object... args){
        if (ERROR.ordinal()>=level.ordinal()){
            String formated=String.format(message,args);
            LogManager.getLogWriter().write(ERROR,formated,packageName);
        }

    }


    public void fatal(String message){
        if (FATAL.ordinal()>=level.ordinal()){
            LogManager.getLogWriter().write(FATAL,message,packageName);
        }
    }

    public void fatal(String message,Object... args){
        if (FATAL.ordinal()>=level.ordinal()){
            String formated=String.format(message,args);
            LogManager.getLogWriter().write(FATAL,formated,packageName);
        }
    }






}
