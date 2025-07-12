package com.logger.core;

import java.util.List;

public class LoggerConfig {
    private Level level;
    private LogWriter logWriter;

    public LoggerConfig setDefaultLevel(Level level){
        this.level=level;
        return this;
    }

    public LoggerConfig setLogWriter(LogWriter logWriter){
        this.logWriter=logWriter;
        return this;
    }

    public Level getDefaultLevel() {
        return level;
    }

    public LogWriter getLogWriter() {
        return logWriter;
    }
}
