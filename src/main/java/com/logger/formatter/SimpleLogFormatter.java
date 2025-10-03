package com.logger.formatter;

import com.logger.core.LogEvent;

import java.time.format.DateTimeFormatter;

public class SimpleLogFormatter implements Formatter{

    @Override
    public String format(LogEvent logEvent) {
        String dash= "_";
        return String.format("%s [%s] %s (%s) %s %s %s",
                logEvent.getTimeStamp().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")),
                logEvent.getThreadName(),
                logEvent.getLevel().toString().toUpperCase(),
                logEvent.getClassName(),
                logEvent.getMethodName(),
                dash,
                logEvent.getMessage());
    }
}
