package uc.interfaces.ornek02;

public class OracleDataBase implements IDatabase {

    @Override
    public void add() {
        System.out.println("OracleDataBase ekleme");
    }

    @Override
    public void delete() {
        System.out.println("OracleDataBase silme");
    }

    @Override
    public void get() {
        System.out.println("OracleDataBase alma");
    }

    @Override
    public void update() {
        System.out.println("OracleDataBase guncelleme");
    }
}
