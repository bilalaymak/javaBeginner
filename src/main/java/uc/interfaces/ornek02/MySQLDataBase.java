package uc.interfaces.ornek02;

public class MySQLDataBase implements IDatabase {

    @Override
    public void add() {
        System.out.println("MySQL ekleme");
    }

    @Override
    public void delete() {
        System.out.println("MySQL silme");
    }

    @Override
    public void get() {
        System.out.println("MySQL alma");
    }

    @Override
    public void update() {
        System.out.println("MySQL guncelleme");
    }
}

