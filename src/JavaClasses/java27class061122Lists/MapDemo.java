package JavaClasses.java27class061122Lists;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String,String>data=new HashMap<>();
        data.put("UserName","Ivan123"); //this is how we store info inside a map
        data.put("Password","pass123");


        System.out.println(data);
        System.out.println(data.get("Password"));
    }
}
