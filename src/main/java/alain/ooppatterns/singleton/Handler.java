/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alain.ooppatterns.singleton;

/**
 *
 * @author alain
 */
public abstract class Handler {

    private Level level;
    protected ErrorManager errorManager;

    protected Handler() {
        this.level = Level.OFF;
        this.errorManager = new ErrorManager();
    }

    public abstract void publish(String text);

    public abstract void flush();

    public abstract void close();

    public void setLevel(Level level) {
        this.level = level;
    }
}
