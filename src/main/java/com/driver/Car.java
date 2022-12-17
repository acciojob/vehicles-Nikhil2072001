package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;
    private String name;

    public Car(String name, boolean isManual) {
        super(name);
        this.isManual = isManual;
        this.name = name;
    }


    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {

        //Hint: Car extends Vehicle
        super(name);
        this.currentGear=1;
    //    this.name=name;
        this.wheels=wheels;
        this.type=type;
        this.doors=doors;
        this.gears=gears;
        this.isManual=isManual;
        this.seats=seats;

    }

    public void changeGear(int newGear){
this.currentGear=newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
Vehicle v = new Vehicle(name);
v.setCurrentSpeed(newSpeed);
v.setCurrentDirection(newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
