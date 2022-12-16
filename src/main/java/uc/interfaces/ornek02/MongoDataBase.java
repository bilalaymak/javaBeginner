package uc.interfaces.ornek02;

public class MongoDataBase implements IDatabase {
    @Override
    public void add() {
        System.out.println("MongoDB ekleme");
    }

    @Override
    public void delete() {
        System.out.println("MongoDB silme");
    }

    @Override
    public void get() {
        System.out.println(" MongoDBalma");
    }

    @Override
    public void update() {
        System.out.println(" MongoDB guncelleme");
    }
}
