package alain.ooppatterns.singleton;

import java.io.Serializable;

/**
 *
 * @author alain Simplified/modified implementation of java.util.logging.Level
 */
public class Level implements Serializable {

    public static final Level OFF = new Level("OFF", Integer.MAX_VALUE);
    public static final Level ERROR = new Level("ERROR", 1000);
    public static final Level WARNING = new Level("WARNING", 900);
    public static final Level INFO = new Level("INFO", 800);

    private static final Level[] levels = {
        INFO, WARNING, ERROR, OFF
    };

    private String name;
    private int value;

    private Level(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public static boolean isValid(String name) {
        for (Level level : levels) {
            if (level.equals(level)) {
                return true;
            }
        }
        return false;
    }

    public static Level[] getLevels() {
        return levels;
    }
}
