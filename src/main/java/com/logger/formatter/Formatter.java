package com.logger.formatter;

import com.logger.core.LogEvent;

public interface Formatter {
    String format(LogEvent logEvent);
}
