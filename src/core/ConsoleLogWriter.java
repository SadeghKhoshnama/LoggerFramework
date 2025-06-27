package core;

public class ConsoleLogWriter implements LogWriter {

    @Override
    public void write(Level level,String message) {
        System.out.println(message);
    }
}
