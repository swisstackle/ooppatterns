package alain.ooppatterns.abstractfactory;


import alain.ooppatterns.abstractfactory.Vehicle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alain
 */
public class Car extends Vehicle {
    private String manufacturer;
    
    public Car(String licensePlate, String owner, int price, int speed, int location_x, String manufacturer) {
        super(licensePlate, owner, price, speed, location_x);
        this.manufacturer = manufacturer;
    }
}
