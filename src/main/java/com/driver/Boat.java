package com.driver;

public class Boat implements WaterVehicle{
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private String name;
    private int capacity;
    Boat(String name,int capacity){
        this.name = name;
        this.capacity = capacity;
    }
    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
