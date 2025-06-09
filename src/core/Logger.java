package core;

public class Logger {
    private String packageName;
    private Level level;

    public Logger(String packageName) {
        this.packageName = packageName;
        this.level=Level.getLevel("INFO");
    }

    public Logger(String packageName,Level level){
        this.packageName=packageName;
        this.level=level;
    }

    public void log(String message){

    }

    public void log(String message,Object... args){

    }
}
