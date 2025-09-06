package com.logger.core;

public interface Appender {
    public void write(LogEvent logEvent);
}
