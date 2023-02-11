package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    public void setManual(boolean manual) {
        isManual = manual;
    }
    private int currentGear;
    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
    private int seats;
    public Car(){

    }
    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.type = type;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
        this.seats = seats;
    }

    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        move(newSpeed,newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
    public int getCurrentDirection(){
        return super.getCurrentDirection();
    }

    public int getCurrentSpeed() {
        return super.getCurrentSpeed();
    }
    public void setCurrentSpeed(int currentSpeed) {
        super.setCurrentSpeed(currentSpeed);
    }
    public void setCurrentDirection(int currentDirection) {
        super.setCurrentDirection(currentDirection);
    }
    public void setName(String name){
        super.setName(name);
    }
    public void stop(){
        super.stop();
    }
    public void move(int speed, int direction){
        setCurrentSpeed(speed);
        setCurrentDirection(direction);
    }
}
