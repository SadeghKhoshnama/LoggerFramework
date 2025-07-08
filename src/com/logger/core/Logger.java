package com.logger.core;

import static com.logger.core.Level.*;

public class Logger {
    private String packageName;
//    private Level level;

    public Logger(String packageName) {
        this.packageName=packageName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void trace(String message){
        if (TRACE.ordinal()>=getOrdinal()){
            LogManager.getLogWriter().write(getLevel(),message,getPackageName());
        }

    }

    public void trace(String message,Object... args){
        if (TRACE.ordinal()>=getOrdinal()){
            String formated= String.format(message,args);
            LogManager.getLogWriter().write(getLevel(),formated,getPackageName());
        }

    }

//    public void debug(String message){
//        if (DEBUG.ordinal()>=level.ordinal()){
//            logWriter.write(logFormatter.format(DEBUG,message,packageName));
//        }
//    }
//
//    public void debug(String message,Object... args){
//        if (DEBUG.ordinal()>=level.ordinal()){
//            String formated=logFormatter.format(DEBUG,String.format(message,args),packageName);
//            logWriter.write(formated);
//        }
//
//    }
//
//    public void info(String message){
//        if (INFO.ordinal()>=level.ordinal()){
//            logWriter.write(logFormatter.format(INFO,message,packageName));
//        }
//    }
//
//    public void info(String message,Object ... args){
//        if (INFO.ordinal()>=level.ordinal()){
//            String formated=logFormatter.format(INFO,String.format(message,args),packageName);
//            logWriter.write(formated);
//        }
//    }
//
//
//    public void warn(String message){
//        if (WARN.ordinal()>=level.ordinal()){
//            logWriter.write(logFormatter.format(WARN,message,packageName));
//        }
//    }
//
//    public void warn(String message,Object... args){
//        if (WARN.ordinal()>=level.ordinal()){
//            String formated=logFormatter.format(WARN,String.format(message,args),packageName);
//            logWriter.write(formated);
//        }
//    }
//
//    public void error(String message){
//        if (ERROR.ordinal()>=level.ordinal()){
//            logWriter.write(logFormatter.format(ERROR,message,packageName));
//        }
//    }
//
//    public void error(String message,Object... args){
//        if (ERROR.ordinal()>=level.ordinal()){
//            String formated=logFormatter.format(ERROR,String.format(message,args),packageName);
//            logWriter.write(formated);
//        }
//
//    }
//
//
//    public void fatal(String message){
//        if (FATAL.ordinal()>=level.ordinal()){
//            logWriter.write(logFormatter.format(FATAL,message,packageName));
//        }
//    }
//
//    public void fatal(String message,Object... args){
//        if (FATAL.ordinal()>=level.ordinal()){
//            String formated=logFormatter.format(FATAL,String.format(message,args),packageName);
//            logWriter.write(formated);
//        }
//    }

    private int getOrdinal(){
        return LogManager.getLevel().ordinal();
    }

    private Level getLevel(){
        return LogManager.getLevel();
    }

}
