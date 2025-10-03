package com.logger.config;

import com.logger.appender.Appender;
import com.logger.core.Level;
import com.logger.formatter.Formatter;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

//todo im thinking about this class to be abstract and have static methods.

public abstract class LoggerConfigurator {

     public static LoggerConfig configureAndReturn() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
         //1-load the property file.
         //2-read the data from the property file.
         Properties properties=new Properties();
         String appender=null;
         String formatter=null;
         String defaultLevel=null;
         try {
             properties.load(new FileInputStream("example.properties")); //todo i will think about file.
              appender =properties.getProperty("logger.appender");
              formatter= properties.getProperty("logger.formatter");
              defaultLevel=properties.getProperty("logger.defaultLevel");
         }catch (IOException e){
             e.getMessage();
             return null;
         }
         //3-with reflection try to create the classes.
         Class<Appender> clazzAppender= (Class<Appender>) Class.forName(appender);
         Class<Formatter> clazzFormatter= (Class<Formatter>) Class.forName(formatter);
         Appender appender1= clazzAppender.getConstructor(clazzFormatter).newInstance();
         com.logger.formatter.Formatter formatter1=clazzFormatter.getConstructor().newInstance();
         LoggerConfig loggerConfig=new LoggerConfig(appender1,formatter1, Level.INFO,null);

         //4-construct the object and return the loggerConfig.
         return loggerConfig;
    }

}
