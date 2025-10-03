package com.logger.appender;

import com.logger.formatter.Formatter;
import com.logger.core.LogEvent;

public class ConsoleAppender implements Appender {

    private final Formatter formatter;

    public ConsoleAppender(Formatter formatter) {
        this.formatter = formatter;
    }

    @Override
    public void write(LogEvent logEvent) {
        String format= formatter.format(logEvent);
        System.out.println(format);
    }
}
