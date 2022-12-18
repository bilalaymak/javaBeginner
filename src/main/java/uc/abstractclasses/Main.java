package uc.abstractclasses;

public class Main {
    public static void main(String[] args) {

     //   AbstractDataBase abstractDataBase = new AbstractDataBase();
     // biz abstract classlarda, interfacelerde oldugu gibi object olusturamiyoruz


        //fakat tipki interface ve inheritancelerde oldugu gibi abstract database'in
        // reference'lerini alttaki classlara atayabiliriz

        AbstractDataBase abstractDataBase1 = new MySQLDataBase();
        AbstractDataBase abstractDataBase2= new MongoDataBase();

        abstractDataBase1.add();//eklendi
        abstractDataBase2.add();//eklendi
        abstractDataBase1.update();//MySQL guncellendi
        abstractDataBase2.update();//Mongo guncellendi

    }
}
