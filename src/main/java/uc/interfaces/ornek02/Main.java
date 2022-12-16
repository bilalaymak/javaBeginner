package uc.interfaces.ornek02;

class DataBaseManager{
    public void AddDataBase(IDatabase database){
        database.add();
    }
    public void DeleteDataBase(IDatabase database){
        database.delete();
    }
    public void GetDataBase(IDatabase database){
        database.get();
    }
    public void UpdateDataBase(IDatabase database){
        database.update();
    }
}

public class Main {
    public static void main(String[] args) {

        /*
        interface'in kullanimi, yeni bir data base class'i olusturuluyor, sonra Main class icinde sadece yeni
        bir (govdesiz methodlar) method(son kullanim yeri degistiriliyor) yaziliyor

        interface'in kullaniminda database'in rigid using i vardir. yerine gore boyle kullanim gerektiginden
        interfaceler kullaniliyor
        yazilim mimarisinde bir degisiklik olmuyor

        */
        DataBaseManager manager = new DataBaseManager();
        manager.AddDataBase(new MySQLDataBase());
        manager.AddDataBase(new MongoDataBase());
        manager.AddDataBase(new OracleDataBase());
    }
}
