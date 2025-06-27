package com.logger.core;

public interface LogFormatter {
    String format(Level level,String message,String packageName);
}
