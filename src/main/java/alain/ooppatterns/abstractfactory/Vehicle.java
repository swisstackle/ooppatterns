package alain.ooppatterns.abstractfactory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alain
 */
public abstract class Vehicle {
    protected String licensePlate;
    protected String owner;
    protected  int price;
    protected int speed;
    protected int location_x;
    
    protected Vehicle(String licensePlate, String owner, int price, int speed, int startingLocation_x) {
        this.licensePlate = licensePlate;
        this.owner = owner;
        this.price = price;
        this.speed = speed;
        this.location_x = startingLocation_x;
    }
    
    public void move(int seconds) {
        this.location_x = this.location_x + speed * seconds;
    }

}
