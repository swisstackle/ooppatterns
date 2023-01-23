/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alain.ooppatterns.abstractfactory;

/**
 *
 * @author alain
 */
public class Test {
    public static void main(String[] args) {
		Vehicle car = VehicleFactory.getVehicle(new CarFactory("pkasdd", "Alain", 5000, 200, 0, "Toyota"));
                Vehicle plane = VehicleFactory.getVehicle(new PlaneFactory("apdskd", "Alain", 20000, 800, 0, 300, 0));
           
    }
}
