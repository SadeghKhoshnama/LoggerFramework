package com.logger.core;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class LogEvent {
    private final Level level;
    private final String message;
    private final LocalDateTime timeStamp;
    private final String threadName;
    private final String packageName;
    private final String className;
    private final String methodName;


    public LogEvent(Level level, String message) {
        this.level = level;
        this.message = message;
        this.timeStamp = LocalDateTime.now();
        this.threadName = Thread.currentThread().getName();
        StackTraceElement stackTraceElement= Thread.currentThread()
                .getStackTrace()[Thread.currentThread().getStackTrace().length -1];
        this.packageName =stackTraceElement.getClassName();
        this.className=stackTraceElement.getFileName();
        this.methodName=stackTraceElement.getMethodName();
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
