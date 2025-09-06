package com.logger.core;

public class Main {
    public static void main(String[] args) {
        Logger logger=new Logger("com.logger.core");
        logger.putAppenders(new ConsoleAppender(new SimpleLogFormatter()));
        logger.log(Level.DEBUG,"This is the first log");


    }
}
