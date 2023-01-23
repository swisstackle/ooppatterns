/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alain.ooppatterns.abstractfactory;

/**
 *
 * @author alain
 */
public class CarFactory implements VehicleAbstractFactory {
    private Car car;
    public CarFactory(String licensePlate, String owner, int price, int speed, int location_x, String manufacturer) {
        car = new Car(licensePlate, owner, price, speed, location_x, manufacturer);
    }
    @Override
    public Vehicle createVehicle() {
        return car;
    }
}
