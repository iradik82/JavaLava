package HM.class27;
/*
Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.
 */

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task2CountriesABC {
    public static void main(String[] args) {
        TreeMap<String,String> countries=new TreeMap<>();
        countries.put("Brazil","Brasília");
        countries.put("Ukraine","Kyiv");
        countries.put("USA","Washington");
        countries.put("Germany","Berlin");
        countries.put("Poland","Warshaw");

        countries.forEach((k,v)->{
            System.out.println(k+" "+v);
        });
        System.out.println("_--------------");

      for(var country:countries.entrySet()){
          System.out.println(country);
      }

        System.out.println("_--------------");

        Iterator<Map.Entry<String, String>> iterator = countries.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("_--------------");

        for(var values:countries.values()){
            System.out.println(values);
        }

        System.out.println("_--------------");

        Iterator<Map.Entry<String,String>>val=countries.entrySet().iterator();
        while(val.hasNext()){
            Map.Entry<String,String>entr=val.next();
            System.out.println(entr.getValue());
        }
        }
        
    }

