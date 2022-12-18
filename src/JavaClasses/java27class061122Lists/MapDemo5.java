package JavaClasses.java27class061122Lists;

import java.util.HashMap;

public class MapDemo5 {
    public static void main(String[] args) {

        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);
        fruit.put("Mango", 1.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);

        /*Collection<Double>values=fruit.values(); // returns all the values from a map
        Iterator<Double>it=values.iterator();

        while(it.hasNext()){
            Double value= it.next();
            if(value>2){
                it.remove();
            }
        }*/

        fruit.values().removeIf(x->x>2);
        System.out.println(fruit);



    }
}