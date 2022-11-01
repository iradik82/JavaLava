package HM.HMOverWriteingMethods;

public class CreditCard {
    /*
    Create a class CreditCard and define variable balance and interest.
    Create an instance method that will calculate interest based on the given balance.
     */
   int balance;
    String interest="20%";

  void procent(){

      System.out.println("my "+ interest+" from your "+balance+" is = "+balance/5 );
  }
}
class Visa extends CreditCard{

}
class Credit2 extends CreditCard{

}
class Ax extends CreditCard{
    String interest="25%";
    void procent(){
        System.out.println("my "+ interest+" from your "+balance+" is = "+balance/4);
    }

}

class testCard{
    public static void main(String[] args) {
        Visa cred=new Visa();
        cred.balance = 2000;
        cred.procent();

        Credit2 cred2=new Credit2();
        cred2.balance = 4500;
        cred2.procent();

        Ax cred3=new Ax();
        cred3.balance = 1000;
        cred3.procent();



    }
}