package core;

public class ConsoleLogWriter extends BaseLogWriter{

    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
