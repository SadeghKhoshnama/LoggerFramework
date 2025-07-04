package com.logger.core;

import java.util.List;

public class LoggerConfig {
    private Level level;
    private List<LogWriter> logWriters;
    private LogFormatter formatter;

    public void setLevel(Level level) {
        this.level = level;
    }

    public List<LogWriter> getLogWriters() {
        return logWriters;
    }

    public void setLogWriters(List<LogWriter> logWriters) {
        this.logWriters = logWriters;
    }

    public void setFormatter(LogFormatter formatter) {
        this.formatter = formatter;
    }

    public Level getLevel() {
        return level;
    }

    public LogFormatter getFormatter() {
        return formatter;
    }
}
