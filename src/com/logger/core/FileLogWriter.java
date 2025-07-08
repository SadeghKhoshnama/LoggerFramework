package com.logger.core;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogWriter implements LogWriter{
    private String filePath;
    private final boolean append;
    private final LogFormatter logFormatter;

    public FileLogWriter(String filePath,LogFormatter logFormatter,boolean append) {
        this.filePath = filePath;
        this.logFormatter=logFormatter;
        this.append=append;
    }

    @Override
    public void write(Level level, String message, String packageName) {
        try (BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(filePath,true))){
            bufferedWriter.write(logFormatter.format(LogManager.getLevel(),message,packageName));
            bufferedWriter.newLine();
        }catch (IOException e){
            System.err.println("Logging failed: " + e.getMessage());
            //todo i will handle it later.
        }
    }
}
