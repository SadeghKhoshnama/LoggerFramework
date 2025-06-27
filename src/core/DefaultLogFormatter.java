package core;

import java.time.LocalDateTime;

public class DefaultLogFormatter implements LogFormatter{

    @Override
    public String format(Level level, String message, String packageName) {
        return "["+ LocalDateTime.now() + "] ["+ level+"]"+ "["+ packageName +"] "+ message;
    }
}
