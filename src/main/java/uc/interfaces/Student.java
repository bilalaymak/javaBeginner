package uc.interfaces;

public class Student implements IDatabase {

    @Override  //buradaki override inheritance'deki override gibi degil
    public void log() {
        System.out.println("ogrenci eklendi");
    }
}
