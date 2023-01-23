package alain.ooppatterns.abstractfactory;

/**
 *
 * @author alain
 */
public class VehicleFactory {
    public static Vehicle getVehicle(VehicleAbstractFactory factory) {
        return factory.createVehicle();
    }
}
