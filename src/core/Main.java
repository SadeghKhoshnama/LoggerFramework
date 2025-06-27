package core;

public class Main {

    private static final Logger logger=LogManager.getLogger("core",Level.INFO,new ConsoleLogWriter(),new DefaultLogFormatter());

    public static void main(String[] args) {
        logger.log(Level.INFO,"Hello Im Sadegh");
    }
}
