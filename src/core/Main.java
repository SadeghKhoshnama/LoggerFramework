package core;

public class Main {

    private static final Logger logger;

    static {
        try {
            logger = LogManager.getLogger("com.sadegh");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

    }
}
