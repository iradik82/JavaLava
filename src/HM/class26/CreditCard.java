package HM.class26;

import java.util.LinkedList;

/*
Create a Card class that will have implemented  and unimplemented methods
and a constructor that will initializes credit card type.
Create 3 subclasses of a Card card. Create 3 objects of different card and store them into LinkedList.
Using for loop/advanced for loop/ iterator access all methods of the class
 */
public abstract class CreditCard {
    String cardType;

    public CreditCard(String cardType) {
        this.cardType = cardType;
    }

    abstract void Limit();

    void Balance(){
        System.out.println("On your "+cardType+" card low balance");
    }

}class wellsFargo extends CreditCard{

    public wellsFargo(String cardType) {
        super(cardType);
    }

    @Override
    void Limit() {
        System.out.println("Limit on your "+cardType+" card is 2000$");
    }
}class bankofAmerica extends CreditCard{

    public bankofAmerica(String cardType) {
        super(cardType);
    }

    @Override
    void Limit() {
        System.out.println("Limit on your "+cardType+" card is 15000$");
    }
}class discover extends CreditCard{

    public discover(String cardType) {
        super(cardType);
    }

    @Override
    void Limit() {
        System.out.println("Limit on your "+cardType+" card is 34000$");
    }
}

class creditcardcheck {
    public static void main(String[] args) {


        LinkedList<CreditCard>credit=new LinkedList<>();
        credit.add(new wellsFargo("WellsFargo"));
        credit.add(new bankofAmerica("Bank of America"));
        credit.add(new discover("Discover"));

        for (CreditCard i:credit){
            i.Balance();
            i.Limit();
        }

        System.out.println("--------------------------------");
        for (int i = 0; i <credit.size() ; i++) {
            credit.get(i).Balance();
            credit.get(i).Limit();
        }

        System.out.println("--------------------------------");

        var it=credit.iterator();
        while (it.hasNext()){
            it.next().Balance();
            it.next().Limit();
        }

    }
}
