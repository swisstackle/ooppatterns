/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alain.ooppatterns.abstractfactory;

/**
 *
 * @author alain
 */
public class PlaneFactory implements VehicleAbstractFactory {
    private Plane plane;
    public PlaneFactory(String licensePlate, String owner, int price, int speed, int startingLocation_x, int span, int metersAboveGround) {
        plane = new Plane(licensePlate, owner, price, speed, startingLocation_x, span, metersAboveGround);
    }
    @Override
    public Vehicle createVehicle() {
        return plane;
    }
}
