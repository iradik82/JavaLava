package JavaClasses.java25class291022WrapperClasses;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorWhile {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts=new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Base");
        beautyProducts.add("Mascara");
        beautyProducts.add("lipstick");
        beautyProducts.add("Dove Soap");
        beautyProducts.add("Conditioner");
        beautyProducts.add("Primer");
        beautyProducts.add("shampoo");
        beautyProducts.add("lotion");
        beautyProducts.add("concealer");
        beautyProducts.add("eyeLinear");

        Iterator<String> iterator=beautyProducts.iterator();

        while (iterator.hasNext()){
            //  String item= iterator.next(); //better approach
            if(iterator.next().endsWith("r")){
                iterator.remove();
            }
        }
        System.out.println(beautyProducts);


    }
}
