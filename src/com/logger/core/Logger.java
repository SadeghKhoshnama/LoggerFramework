package com.logger.core;

import static com.logger.core.Level.*;

public class Logger {
    private String packageName;
    private Level level;
    private LogWriter logWriter;
    private LogFormatter logFormatter;

    public Logger(String packageName) {
        this(packageName, INFO,new ConsoleLogWriter(),new DefaultLogFormatter());
    }

    public Logger(String packageName,Level level){
        this(packageName,level,new ConsoleLogWriter(),new DefaultLogFormatter());
    }

    public Logger(String packageName, Level level,LogWriter logWriter,LogFormatter logFormatter) {
        this.packageName = packageName;
        this.level = level;
        this.logWriter = logWriter;
        this.logFormatter=logFormatter;
    }


    public void info(String message){
        logWriter.write(logFormatter.format(INFO,message,packageName));
    }

    public void info(String message,Object ... args){
        String formated=logFormatter.format(INFO,String.format(message,args),packageName);
        logWriter.write(formated);
    }

    public void error(String message){
        logWriter.write(logFormatter.format(ERROR,message,packageName));
    }

    public void error(String message,Object... args){
        String formated=logFormatter.format(ERROR,String.format(message,args),packageName);
        logWriter.write(formated);
    }

















//    public void log(Level level, String message){
//        if (level.ordinal()>= this.level.ordinal()){
//            logWriter.write(logFormatter.format(level,message,packageName));
//        }
//    }
//
//    public void log(Level level,String message,Object... args){
//
//    }



}
