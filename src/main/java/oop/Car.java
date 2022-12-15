package oop;

public class Car {
    //fields, properties

    private String color;
    private String model;
    private double engine;
    private int doors;

    public void setColor(String color) {   // set function
        this.color = color;
    }
    public String getColor() {     //get function
        return this.color;
    }


    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return this.model;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }
    public double getEngine() {
        return this.engine;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public int getDoors() {
        return this.doors;
    }


}
