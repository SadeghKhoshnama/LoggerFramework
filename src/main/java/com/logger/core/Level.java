package com.logger.core;

public enum Level {

    FATAL(6),
    ERROR(5),
    WARN(4),
    INFO(3),
    DEBUG(2),
    TRACE(1),
    ;
    private final int priority;

    Level(int priority) {
        this.priority=priority;
    }

    public int getPriority() {
        return priority;
    }
}
