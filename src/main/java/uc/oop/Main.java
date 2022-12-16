package uc.oop;

import uc.oop.Car;

public class Main {
    public static void main(String[] args) {


        Car car1 = new Car("gumus","Renault Megane",1.6, 4); //Car object'i
        Car car2 = new Car();//burada overloading icin yeni bir object olusturduk
        Car car3 = new Car("Siyah","Mercedes");

        car1.showInfos();
        car2.showInfos();
        car3.showInfos();



      /*
      boyle kullanim kullanisli olmadigi icin Car classinda bir constructer olusturup
      onu burada kullaniyoruz

      //asagisi eski durum

      car1.setColor("Gumus");
      car1.setModel("Renault Megane");
      car1.setEngine(1.6);
      car1.setDoors(4);
      */


      /*

      //Car classinda ShowInfos method u yazdigimiz icin buraya artik gerek kalmadi

      System.out.println("Arabanin Rengi = " + car1.getColor());
      System.out.println("Arabanin Modeli = " + car1.getModel());
      System.out.println("Arabanin Motor Hacmi = " + car1.getEngine());
      System.out.println("Arabanin Kapi sayisi = " + car1.getDoors());
        car1.start();
        car1.stop();
      */

    }

    /*
        car1.color = "gumus";
        car1.model = "Renault Megane";
        car1.engine = 1.6;
        car1.doors = 4;

        System.out.println("Arabanin Rengi = " + car1.color);

     */











}
