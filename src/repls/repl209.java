package repls;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class repl209 {
    public static void main(String[] args) {
        List<Map<String, Object>> dataList = new LinkedList<>();
        Map<String, Object> appleMap = new LinkedHashMap<>();
        appleMap.put("Items", "Apple");
        appleMap.put("Price", 20.0);
        appleMap.put("Quantity", 10.0);
        dataList.add(appleMap);

        Map<String, Object> orangeMap = new LinkedHashMap<>();
        orangeMap.put("Items", "Orange");
        orangeMap.put("Price", 21.99);
        orangeMap.put("Quantity", 10.0);
        dataList.add(orangeMap);

       double Total=0.0;
       for (var dl:dataList){

           double price=(double) dl.get("Price");
           double qa=(double) dl.get("Quantity");

           Object subTotal=price*qa;
           Total+=(double) subTotal;
           dl.put("SubTotal",subTotal);

           for(var entry:dl.entrySet()){
               System.out.print(entry.getKey()+": "+entry.getValue()+" ");
           }
           System.out.println(" ");
       }
        System.out.println(Total);
    }
}

