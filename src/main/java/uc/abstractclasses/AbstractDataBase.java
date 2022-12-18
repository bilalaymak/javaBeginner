package uc.abstractclasses;

public abstract class AbstractDataBase {
    /*
          eger ortak olan methodlarimiz varsa bunlari abstract classlarda yazariz
          (govdeli method olarak)
          */
    public void add(){ //bunlar da bizim govdeli methodlarimiz
        System.out.println("eklendi");
    }
    public void delete(){
        System.out.println("silindi");
    }

    /*
       eger farkli olacak methodlarimiz varsa da bunu abstract (method) olarak yazariz
        */
    abstract void update();//bunlar bizim soyut methodlarimiz
    abstract void get();
}

