package com.logger.core;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logger {
//    private final List<Appender> appenders;
    private final String packageName;
    private Level level;

    public Logger(String packageName,Level level) {
        this.packageName = packageName;
        this.level=level;
    }

    public void log(Level level , String message){
        if (level.getPriority()>= this.level.getPriority()){
            LogManager.log(level,message);
        }
    }
}
