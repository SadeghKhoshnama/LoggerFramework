package com.logger.core;

import java.time.LocalDateTime;

public class LogEvent {
    private final Level level;
    private final String message;
    private final LocalDateTime timeStamp;
    private final String threadName;
    private final String className;
    private final String methodName;



    public LogEvent(Level level, String message) {
        this.level=level;
        this.message=message;
        this.timeStamp = LocalDateTime.now();
        StackTraceElement[] stackTraceElements=Thread.currentThread().getStackTrace();
        StackTraceElement stackTraceElement= stackTraceElements[3];
        this.threadName = Thread.currentThread().getName();
        this.className = stackTraceElement.getFileName();
        this.methodName = stackTraceElement.getMethodName();
    }


    public String getClassName() {
        return className;
    }

    public String getMethodName() {
        return methodName;
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
