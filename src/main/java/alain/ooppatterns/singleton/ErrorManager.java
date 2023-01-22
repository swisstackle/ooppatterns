package alain.ooppatterns.singleton;

/**
 *
 * @author alain
 */
public class ErrorManager {

    public ErrorManager() {
    }

    public void error(String message, Exception ex, int errorCode) {
        System.err.println("Error upon logging " + errorCode);
        System.err.println("0: Generic Failure"
                + "\n1: Write Failure"
                + "\n2 = Flush Failure"
                + "\n3 = Close Failure");
        System.err.println(message);

        if (ex != null) {
            ex.printStackTrace();
        }

    }
}
