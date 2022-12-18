package uc.abstractclasses;

public class MySQLDataBase extends AbstractDataBase {
    @Override
    void update() {
        System.out.println("MySQL guncellendi");
    }

    @Override
    void get() {
        System.out.println("MySQL verileri aldi");
    }
}
