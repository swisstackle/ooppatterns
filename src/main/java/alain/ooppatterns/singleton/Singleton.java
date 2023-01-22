package alain.ooppatterns.singleton;

/**
 *
 * @author alain
 */
public class Singleton {

    public static void main(String[] args) {
        Logger.getLogger().log("This is an info");
        Logger.getLogger().setLevel(Level.ERROR);
        Logger.getLogger().log("This is an error.");
    }
}
