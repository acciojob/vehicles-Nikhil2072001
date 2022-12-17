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

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
