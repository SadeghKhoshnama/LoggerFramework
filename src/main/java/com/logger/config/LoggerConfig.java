package com.logger.config;

import com.logger.appender.Appender;
import com.logger.core.Level;
import com.logger.formatter.Formatter;

public class LoggerConfig {
    private final Appender appender;
    private final Formatter formatter;
    private final Level level;
    private final String sizeOfFile;

    public LoggerConfig(Appender appender, Formatter formatter, Level level, String sizeOfFile) {
        this.appender = appender;
        this.formatter = formatter;
        this.level = level;
        this.sizeOfFile = sizeOfFile;
    }

    public Appender getAppender() {
        return appender;
    }

    public Formatter getFormatter() {
        return formatter;
    }

    public Level getLevel() {
        return level;
    }

    public String getSizeOfFile() {
        return sizeOfFile;
    }
}
