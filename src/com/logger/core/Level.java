package com.logger.core;

public enum Level {
    TRACE(0),
    DEBUG(1),
    INFO(2),
    WARN(3),
    ERROR(4),
    FATAL(5);

    private final int priority;

    Level(int priority) {
        this.priority = priority;
    }
    public static Level getLevel(String level){
        if (level==null) return null;
        return switch (level) {
            case "trace" -> Level.TRACE;
            case "debug" -> Level.DEBUG;
            case "info" -> Level.INFO;
            case "warn" -> Level.WARN;
            case "error" -> Level.ERROR;
            case "fatal" -> Level.FATAL;
            default -> null;
        };
    }


}
