package repls;

import java.util.LinkedHashMap;

public class repl202 {
    public static void main(String[] args) {
        LinkedHashMap<String,String>fruits=new LinkedHashMap<>();
        fruits.put("1 item","apple");
        fruits.put("2 item","banana");
        fruits.put("3 item","pear");
        fruits.put("4 item","tomato");
        fruits.put("5 item","mango");
        fruits.put("6 item","kiwi");

        fruits.forEach((k,v)->{
            System.out.println(k+" "+v);});


    }
}
