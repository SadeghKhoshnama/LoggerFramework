package com.logger.core;

import java.util.List;

public class LoggerConfig {
    private Level level;
    private LogWriter logWriter;
    private LogFormatter formatter;

    public LoggerConfig setLevel(Level level){
        this.level=level;
        return this;
    }

    public LoggerConfig setLogWriter(LogWriter logWriter){
        this.logWriter=logWriter;
        return this;
    }

    public LoggerConfig setFormatter(LogFormatter formatter){
        this.formatter=formatter;
        return this;
    }

    public Level getLevel() {
        return level;
    }

    public LogWriter getLogWriter() {
        return logWriter;
    }

    public LogFormatter getFormatter() {
        return formatter;
    }
}
