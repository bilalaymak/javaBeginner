package uc.interfaces;

public class Customer implements IDatabase {

    @Override
    public void log() {
        System.out.println("musteri eklendi");
    }
}
