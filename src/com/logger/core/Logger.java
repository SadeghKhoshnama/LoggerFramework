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


    public void trace(String message){
        logWriter.write(logFormatter.format(TRACE,message,packageName));
    }

    public void trace(String message,Object... args){
        String formated=logFormatter.format(TRACE,String.format(message,args),packageName);
        logWriter.write(formated);
    }

    public void debug(String message){
        logWriter.write(logFormatter.format(DEBUG,message,packageName));
    }

    public void debug(String message,Object... args){
        String formated=logFormatter.format(DEBUG,String.format(message,args),packageName);
        logWriter.write(formated);
    }

    public void info(String message){
        logWriter.write(logFormatter.format(INFO,message,packageName));
    }

    public void info(String message,Object ... args){
        String formated=logFormatter.format(INFO,String.format(message,args),packageName);
        logWriter.write(formated);
    }


    public void warn(String message){
        logWriter.write(logFormatter.format(WARN,message,packageName));
    }

    public void warn(String message,Object... args){
        String formated=logFormatter.format(WARN,String.format(message,args),packageName);
        logWriter.write(formated);
    }

    public void error(String message){
        logWriter.write(logFormatter.format(ERROR,message,packageName));
    }

    public void error(String message,Object... args){
        String formated=logFormatter.format(ERROR,String.format(message,args),packageName);
        logWriter.write(formated);
    }


    public void fatal(String message){
        logWriter.write(logFormatter.format(FATAL,message,packageName));
    }

    public void fatal(String message,Object... args){
        String formated=logFormatter.format(FATAL,String.format(message,args),packageName);
        logWriter.write(formated);
    }

}
