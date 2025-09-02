package com.logger.core;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DefaultLogFormatter implements LogFormatter{
    private DateTimeFormatter dateTimeFormatter;

    public DefaultLogFormatter() {
        this.dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    public DefaultLogFormatter(DateTimeFormatter customeDateTimeFormatter) {
        this.dateTimeFormatter=customeDateTimeFormatter!=null
                ? customeDateTimeFormatter
                : dateTimeFormatter;
    }


    public void setDateTimeFormatter(String dateTimeFormatter) {
        this.dateTimeFormatter = DateTimeFormatter.ofPattern(dateTimeFormatter);
    }

    @Override
    public String format(Level level, String message, String packageName) {
        String timeStamp=LocalDateTime.now().format(dateTimeFormatter);
        return "["+ timeStamp + "] ["+ level+"]"+ "["+ packageName +"] "+ message;
    }
}
