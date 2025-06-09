package core;

public class Level {
    private String name;

    private static final Level INFO=new Level("INFO");

    private Level(String name) {
        this.name = name;
    }


    public static Level getLevel(String levelName){
        //tbd
        return INFO;
    }


}
