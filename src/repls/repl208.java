package repls;

import java.util.HashMap;
import java.util.Map;

public class repl208 {
    void display(Map<String,Integer>map){
        if(map.isEmpty()){
            System.out.println("map is empty");
        }else{
            map.forEach((k,v)-> {System.out.println(k+" "+v);});

            }
        }


    public static void main(String[] args) {
        HashMap<String,Integer>map=new HashMap<>();
        map.put("mango", 10);
        map.put("apple", 30);
        map.put("orange", 20);


        repl208 rep=new repl208();
        rep.display(map);

        System.out.println("----------");

        map.clear();
        rep.display(map);

    }
}
