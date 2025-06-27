package core;

public class Logger {
    private String packageName;
    private Level level;
    private LogWriter logWriter;

    public Logger(String packageName) {
        this(packageName,Level.INFO,new ConsoleLogWriter());
    }

    public Logger(String packageName,Level level){
        this(packageName,level,new ConsoleLogWriter());
    }

    public Logger(String packageName, Level level, LogWriter logWriter) {
        this.packageName = packageName;
        this.level = level;
        this.logWriter = logWriter;
    }

    public void log(Level level, String message){
        logWriter.write(level,message);
    }

    public void log(Level level,String message,Object... args){
    }



}
