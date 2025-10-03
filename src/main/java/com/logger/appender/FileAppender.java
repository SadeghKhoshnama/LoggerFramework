    package com.logger.appender;

    import com.logger.formatter.Formatter;
    import com.logger.core.LogEvent;

    public class FileAppender implements Appender {
        private final String filePath;
        private final String fileName;
        private final Formatter formatter;
        private int sizeOfFile=1;   //todo i dont know about this yet.

        public FileAppender(String filePath, String fileName, Formatter formatter) {
            this.filePath = filePath;
            this.fileName = fileName;
            this.formatter = formatter;
        }

        @Override
        public void write(LogEvent logEvent) {
            //todo we are gonna put file logic here.
        }
    }
