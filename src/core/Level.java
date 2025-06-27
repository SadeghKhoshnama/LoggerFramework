package core;

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


}
