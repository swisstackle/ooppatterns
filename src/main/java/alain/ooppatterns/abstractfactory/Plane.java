package alain.ooppatterns.abstractfactory;

/**
 *
 * @author alain
 */

import alain.ooppatterns.abstractfactory.Vehicle;
import java.lang.Math;

public class Plane extends Vehicle {
    private int span;
    private int metersAboveGround;
    public Plane(String licensePlate, String owner, int price, int speed, int startingLocation_x, int span, int metersAboveGround) {
        super(licensePlate, owner, price, speed, startingLocation_x);
        this.span = span;
        this.metersAboveGround = 0;
    }
    
    public void up(int angle, int seconds) {
        double radians = Math.toRadians(angle);
        double c = seconds * speed;
        double a = c * Math.sin(radians);
        metersAboveGround = metersAboveGround + (int)Math.round(a); 
    }
}
