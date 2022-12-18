package HM.class27;

import java.util.HashMap;

/*
Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.
 */
public class test3BestBuy {
    public static void main(String[] args) {
        HashMap<String,String>bestBuy=new HashMap<>();
        bestBuy.put("765442","speakers");
        bestBuy.put("754644","XBox");
        bestBuy.put("3253254","Microwave");
        bestBuy.put("124324","TV");
        bestBuy.put("134341","Iphone");

        for(var all:bestBuy.entrySet()){
            System.out.println(all);
        }
    }
}
