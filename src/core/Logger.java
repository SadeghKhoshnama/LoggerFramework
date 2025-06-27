package core;

import java.time.LocalDateTime;

public class Logger {
    private String packageName;
    private Level level;
    private LogWriter logWriter;
    private LogFormatter logFormatter;

    public Logger(String packageName) {
        this(packageName,Level.INFO,new ConsoleLogWriter(),new DefaultLogFormatter());
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

    public void log(Level level, String message){
        if (level.ordinal()>= this.level.ordinal()){
            logWriter.write(logFormatter.format(level,message,packageName));
        }
    }

    public void log(Level level,String message,Object... args){

    }



}
