package JavaClasses.java23class161022AbstractInterface;

public interface IdataBase {

    public static final int age=10;
    void openDatabase();
    void readData();
    void writeData();
    void closeDatabase();
}
class IBM implements IdataBase{

    @Override
    public void openDatabase() {
        System.out.println("Opening the IBM Database");
    }

    @Override
    public void readData() {
        System.out.println("Reading the data from IBM");
    }

    @Override
    public void writeData() {
        System.out.println("Writing the data to IBM");
    }

    @Override
    public void closeDatabase() {
        System.out.println("Closing the IBM database");
    }
}
