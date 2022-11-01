package JavaClasses.java23class161022AbstractInterface;

public class dataBaseTester {
    public static void main(String[] args) {
        //from abstract class
        DataBase dataBase=new MicrosoftDataBase();
        dataBase.openDatabase();
        dataBase.readData();
        dataBase.writeData();
        dataBase.closeDatabase();


       /* DataBase dataBase=new Oracle();
        dataBase.openDatabase();
        dataBase.readData();
        dataBase.writeData();
        dataBase.closeDatabase();*/

        // from interface class
        IdataBase idataBase=new IBM();
        idataBase.openDatabase();
        idataBase.readData();
        idataBase.writeData();
        idataBase.closeDatabase();
    }
}
