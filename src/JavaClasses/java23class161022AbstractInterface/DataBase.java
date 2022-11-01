package JavaClasses.java23class161022AbstractInterface;

public abstract class DataBase {

   abstract void openDatabase();
   abstract void readData();
   abstract void writeData();
   abstract void closeDatabase();

}

/*
how over the error and click on implement methods option
 */
class MicrosoftDataBase extends DataBase{

   @Override
   void openDatabase() {
      System.out.println("Opening the Microsoft Database");
   }

   @Override
   void readData() {
      System.out.println("Reading the data from MSDatabase");
   }

   @Override
   void writeData() {
      System.out.println("Writing the data to MSDataBase");
   }

   @Override
   void closeDatabase() {
      System.out.println("Closing the MSDatabase");
   }
}
class Oracle extends DataBase{

   @Override
   void openDatabase() {
      System.out.println("Opening the Oracle Database");
   }

   @Override
   void readData() {
      System.out.println("Reading the data from Oracle database");
   }

   @Override
   void writeData() {
      System.out.println("Writing the data to Oracle database");
   }

   @Override
   void closeDatabase() {
      System.out.println("Closing the Oracle database");
   }
}
