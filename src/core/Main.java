package core;

import java.time.format.DateTimeFormatter;

public class Main {

    private static final Logger logger
            =LogManager.getLogger("core",Level.INFO,new FileLogWriter("logger",true),new DefaultLogFormatter());


    public static void main(String[] args) {
        logger.log(Level.INFO,"Hello Im Sadegh");
        logger.log(Level.INFO,"Yeah it has been written into the file");
        logger.log(Level.INFO,"This is Awesome");
        logger.log(Level.INFO,"Yeahhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }
}
