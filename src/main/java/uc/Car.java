package uc;

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

    public Car(String color, String model){
        this(color,model,0,0);
    }

    public Car(){ //burada overloading icin bir constructer olusturduk
        /*this.color ="Bilgi yok";
        this.model ="Bilgi yok";
        this.engine = 0;
        this.doors = 0;

         */
        //soyle de yapilabilir, daha kisa yolu
        this("bilgi yok","bilgi yok", 0, 0);
    }

    public Car(String color, String model, double engine, int doors){ //constructer
        this.color = color;
        this.model = model;
        this.engine = engine;
        this.doors = doors;

    }

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
        if (doors == 2 || doors == 4){ //bu ifadeyi sonradan ekledik, eger baska bir kullanici
            //kapi sayisini degistirmek isterse bu iki secenekten biri olsun diye
            //burada biz if yapisiyla yeni comment'e kisitlama getirdik
            this.doors = doors;
        }
        else {
            System.out.println("kapi sayisi sadece 2 veya 4 olabilir");
        }

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
    public void showInfos(){
        System.out.println("Arabanin Rengi = " + this.color);
        System.out.println("Arabanin Modeli = " + this.model);
        System.out.println("Arabanin Motor Hacmi = " + this.engine);
        System.out.println("Arabanin Kapi sayisi = " + this.doors);

    }


}
