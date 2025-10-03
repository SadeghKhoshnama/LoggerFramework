package com.logger.appender;

import com.logger.core.LogEvent;

public interface Appender {
    public void write(LogEvent logEvent);
}
