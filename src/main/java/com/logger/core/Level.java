package com.logger.core;

public enum Level {

    FATAL(1),
    ERROR(2),
    WARN(3),
    INFO(4),
    DEBUG(5),
    TRACE(6),
    ;
    private int priority;

    Level(int priority) {
        this.priority=priority;
    }
}
