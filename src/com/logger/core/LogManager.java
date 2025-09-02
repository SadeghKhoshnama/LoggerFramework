package com.logger.core;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class LogManager {

    private static LoggerConfig loggerConfig=new LoggerConfig();
    private static LogWriter logWriter;
    private static final Map<String,Logger> logObjects=new HashMap<>();
    private static final Properties properties=new Properties();

    private LogManager() {
    }

    public static Logger newLogger(String packageName, String filePath){
        if (packageName==null || packageName.isEmpty())
            throw new IllegalArgumentException("PackageName should not be null");
        if (filePath==null || filePath.isEmpty()){
            return newLogger(packageName);
        }
        try {
            properties.load(new FileInputStream(filePath));
        }catch (Exception e){
            e.printStackTrace();
        }
        String level=properties.getProperty("logger.defaultLevel");
        String writer=properties.getProperty("logger.writer");
        String formatter=properties.getProperty("logger.formatter");

//        loggerConfig.setDefaultLevel(Level.getLevel(level));
        DefaultLogFormatter defaultLogFormatter=new DefaultLogFormatter();
        defaultLogFormatter.setDateTimeFormatter(formatter);
        if (writer.equals("file")){
            String fileAddress=properties.getProperty("logger.fileAddress");
            logWriter=new FileLogWriter(fileAddress,defaultLogFormatter,true);
        }else
            logWriter=new ConsoleLogWriter(defaultLogFormatter);

//        loggerConfig.setLogWriter(logWriter);
        Logger logger=new Logger(packageName,Level.getLevel(level));
        logObjects.put(packageName,logger);
        return logger;
    }



    public static Logger newLogger(String packageName){
        if (loggerConfig==null){
            ensureLoggerInitialization();
        }
        Logger logger=new Logger(packageName,loggerConfig.getDefaultLevel());
        logObjects.put(packageName,logger);
        return logger;
    }

    public static LogWriter getLogWriter(){
        return logWriter;
    }



    public static void initialize(LoggerConfig config){
        loggerConfig=config;
        logWriter=config.getLogWriter();
    }


    public static void setLevel(String packageName,Level level){
        Logger targetLogger=logObjects.get(packageName);
        if (targetLogger==null)
            throw new RuntimeException("There is no active logger inside this package");
        targetLogger.setLevel(level);
    }

    //helper method
    private static void ensureLoggerInitialization(){
        if (loggerConfig==null){
            LogFormatter logFormatter=new DefaultLogFormatter();
            logWriter=new ConsoleLogWriter(new DefaultLogFormatter());
            loggerConfig=new LoggerConfig()
                    .setDefaultLevel(Level.INFO)
                    .setLogWriter(new ConsoleLogWriter(logFormatter));
        }
    }
}
