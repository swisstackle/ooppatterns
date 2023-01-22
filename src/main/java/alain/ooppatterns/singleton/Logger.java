/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alain.ooppatterns.singleton;

/**
 *
 * @author alain Logger using SingleTon pattern and double-checked locking.
 */
public class Logger {

    private static Logger logger = null;
    private Level level;

    private Handler handler;

    private Logger(Level level) {
        this.level = level;
        this.handler = new ConsoleHandler(level);
    }

    public synchronized void log(String message) {
        if (this.level != Level.OFF) {
            this.handler.publish(this.level.getName() + ": " + message + "\n");
        }

    }

    public static Logger getLogger() {
        if (logger == null) {
            synchronized (Logger.class) {
                if (logger == null) {
                    logger = new Logger(Level.INFO);
                }
            }
        }
        return logger;
    }

    public void reset() {
        this.handler.close();
        this.handler = new ConsoleHandler(Level.INFO);
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
