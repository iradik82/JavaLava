package HM.HM0210;

public class StudClass {
   /*
    Write a Student class   that have instance variables name and address.
     Create a constructor that will initialize those variables.
      Print name & address of given  student using displayInfo method.
    */

    String name;
    String address;

    public StudClass(String name, String address) {
        this.name = name;
        this.address = address;
    }
  public void prinInfo(){
     System.out.println("Name "+name+" Address "+address);
 }
    public static void main(String[] args) {
        StudClass Ivan=new StudClass("Ivan","Pittsburgh,PA");
      Ivan.prinInfo();

    }
}
