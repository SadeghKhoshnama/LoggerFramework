package com.logger.core;

public class ConsoleLogWriter implements LogWriter {
    private final LogFormatter logFormatter;

    public ConsoleLogWriter(LogFormatter logFormatter) {
        this.logFormatter = logFormatter;
    }

    @Override
    public void write(Level level,String message,String packageName) {
        //formating before do the writing
        String formated=logFormatter.format(level,message,packageName);
        System.out.println(formated);
    }
}
