package JavaClasses.java27class061122Lists;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class mapDemo6 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99);
        fruit.put("Mango", 1.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);

        Set < Map.Entry<String,Double>>entrySet= fruit.entrySet();
    }
}
