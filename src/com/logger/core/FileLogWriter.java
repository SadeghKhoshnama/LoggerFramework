package com.logger.core;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogWriter implements LogWriter{
    private String filePath;
    private final boolean append;

    public FileLogWriter(String filePath,boolean append) {
        this.filePath = filePath;
        this.append=append;
    }

    @Override
    public void write(String message) {

        try (BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(filePath,true))){
            bufferedWriter.write(message);
            bufferedWriter.newLine();
        }catch (IOException e){
            System.err.println("Logging failed: " + e.getMessage());
            //todo i will handle it later.
        }

    }
}
