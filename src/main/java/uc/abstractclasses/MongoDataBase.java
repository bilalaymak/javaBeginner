package uc.abstractclasses;

public class MongoDataBase extends AbstractDataBase{
    @Override
    void update() {
        System.out.println("Mongo guncellendi");
    }

    @Override
    void get() {
        System.out.println("Mongo verileri aldi");
    }
}
