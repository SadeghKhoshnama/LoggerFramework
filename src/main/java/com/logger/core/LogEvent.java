package com.logger.core;

import java.time.LocalDateTime;

public class LogEvent {
    private final Level level;
    private final String message;
    private final LocalDateTime timeStamp;
    private final String threadName;
    private final String packageName;

    public LogEvent(Level level, String message, LocalDateTime timeStamp, String threadName, String packageName) {
        this.level = level;
        this.message = message;
        this.timeStamp = timeStamp;
        this.threadName = threadName;
        this.packageName = packageName;
    }


    public String getPackageName() {
        return packageName;
    }

    public Level getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public String getThreadName() {
        return threadName;
    }


    @Override
    public String toString() {
        return "LogEvent{" +
                "level=" + level +
                ", message='" + message + '\'' +
                ", timeStamp=" + timeStamp +
                ", threadName='" + threadName + '\'' +
                '}';
    }
}
