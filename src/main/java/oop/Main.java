package oop;

public class Main {
    public static void main(String[] args) {


        Car car1 = new Car(); //Car object'i

      car1.setColor("Gumus");
      car1.setModel("Renault Megane");
      car1.setEngine(1.6);
      car1.setDoors(4);
      System.out.println("Arabanin Rengi = " + car1.getColor());
      System.out.println("Arabanin Modeli = " + car1.getModel());
      System.out.println("Arabanin Motor Hacmi = " + car1.getEngine());
      System.out.println("Arabanin Kapi sayisi = " + car1.getDoors());
      car1.start();
      car1.stop();

    }

    /*
    car1.color = "gumus";
        car1.model = "Renault Megane";
        car1.engine = 1.6;
        car1.doors = 4;

        System.out.println("Arabanin Rengi = " + car1.color);

     */











}
