package HM.HMiarrayList;

import java.util.ArrayList;

public class eventNumbers {
    public static void main(String[] args) {
        ArrayList<Integer>even=new ArrayList<>();

        for (int i = 2; i <=500 ; i+=2) {
         even.add(i);
        }


       var iterato=even.iterator();
        while(iterato.hasNext()){
            if(iterato.next()%5!=0){
iterato.remove();
            }
        }
        System.out.println(even);
    }
}
