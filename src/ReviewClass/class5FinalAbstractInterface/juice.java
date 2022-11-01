package ReviewClass.class5FinalAbstractInterface;
final class Drink{

    void drink(){
        System.out.println("drinking method");
    }
   protected final void enjoy(){
        System.out.println("we enjoy drinking water");
    }
}
//CE: the type Juice cannot subclass the final class drink
//public class juice extends Drink {

  /* CE: Cannot override the final method from Drink
  public void enjoy(){
       System.out.println("we enjoy drinking juice");
    }*/

