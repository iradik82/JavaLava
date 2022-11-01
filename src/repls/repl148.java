package repls;

public class repl148 {
    String item;
    double price;
   double quantity;

    repl148(String item,double price,double quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;
        System.out.println(item+" Toatal Value " +price*quantity);
    }
    double itemTotalPrice(){
        double sum=price*quantity;
        return sum;
    }
}


class testert{
    public static void main(String[] args) {
        repl148 re=new repl148("Blanket",33.33,3);
        re.itemTotalPrice();

        repl148 re1=new repl148("Mattress",168.33,3);
        re1.itemTotalPrice();

        System.out.println("Your purchase "+(re.itemTotalPrice()+re1.itemTotalPrice())+" Today");
    }
}
