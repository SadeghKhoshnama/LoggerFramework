package core;

public class LogManager {


    public static Logger getLogger(String packageName){
        if (packageName==null || packageName.isBlank()){
            //todo i dont know whether i throw an exception or just return null.
        }
        return new Logger(packageName);
    }

    public static Logger getLogger(String packageName,Level level,LogWriter logWriter,LogFormatter logFormatter){
        if (packageName==null || packageName.isBlank()){
            //todo i dont know whether i throw an exception or just return null.
        }
        return new Logger(packageName,level,logWriter,logFormatter);
    }


}
