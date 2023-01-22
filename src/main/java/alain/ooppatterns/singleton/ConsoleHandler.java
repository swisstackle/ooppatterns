/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alain.ooppatterns.singleton;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author alain
 */
public class ConsoleHandler extends Handler {

    private Writer writer;

    public ConsoleHandler(Level level) {
        this.writer = new OutputStreamWriter(System.err);
    }

    @Override
    public void publish(String text) {
        try {
            writer.write(text);
        } catch (java.io.IOException ex) {
            errorManager.error(null, ex, 1);
        } catch (Exception ex) {
            errorManager.error(null, ex, 0);
        }
        flush();
    }

    @Override
    public void flush() {
        try {
            if (writer != null) {
                writer.flush();
            }
        } catch (Exception ex) {
            errorManager.error(null, ex, 2);
        }
    }

    @Override
    public void close() {
        try {
            writer.close();
        } catch (Exception ex) {
            errorManager.error(null, ex, 3);
        }
    }

}
