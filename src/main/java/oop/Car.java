package oop;

public class Car {
    //fields, properties
    /*
    encapsulation: buyuk projelerde dosyalara erisim bircok kisi tarafindan yapildigi icin
    assignmentlerin farkli commentorlar tarafindan yanlis bir sekilde girilmesini onlemek icin
    variablellar private yapilir. eger public olarak kalirsa variablelarin kontrolu kaybolur.
    bundan dolayi encapsulation yapiliyor
     */

    private String color;
    private String model;
    private double engine;
    private int doors;

    public void setColor(String color) {   // set function
        this.color = color;  //this. reference pointer'i
    }
    public String getColor() {     //get function
        return this.color;
    }

    //getter setter otomatik olarak yapma (sayfaya sag tikla, generate i tikla, getter setter'i tikla)


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

    public void start(){
        System.out.println("araba calisti");
    }
    public void stop(){
        System.out.println("araba durdu");
    }


}
