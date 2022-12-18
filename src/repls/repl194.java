package repls;

import java.util.LinkedList;

public class repl194 {

    LinkedList update(LinkedList<String>countries){
        for (int i=0;i<countries.size();i++){
            if(countries.get(i).startsWith("A")){
                countries.remove(i);
            }
        }
        return countries;
    }
    public static void main(String[] args) {
            LinkedList<String> countries = new LinkedList<>();
            countries.add("Armenia");
            countries.add("USA");
            countries.add("Kazakhstan");
            countries.add("Australia");
            countries.add("Pakistan");
            countries.add("Russia");
            countries.add("Azerbaijan");
           repl194 rep =new repl194();
            System.out.println( rep.update(countries));
        System.out.println(countries.size());
        }
         }



