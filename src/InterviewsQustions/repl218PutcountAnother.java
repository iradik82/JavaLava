package InterviewsQustions;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class repl218PutcountAnother {
    public static void main(String[] args) {
        List<String> deviceNames1 = new ArrayList<>();
        deviceNames1.add("switch");
        deviceNames1.add("tv");
        deviceNames1.add("switch");
        deviceNames1.add("tv");
        deviceNames1.add("switch");
        deviceNames1.add("tv");

        List<String> deviceNames2 = new ArrayList<>();
        deviceNames2.add("switch");
        deviceNames2.add("tv");
        deviceNames2.add("switch");
        deviceNames2.add("tv");
        deviceNames2.add("switch");
        deviceNames2.add("tv");
        deviceNames2.add("radio");
        List<String> deviceNames3 = new ArrayList<>();
        deviceNames3.add("switch");
        deviceNames3.add("tv");
        deviceNames3.add("switch");
        deviceNames3.add("tv");


      //  System.out.println(countDeviceNames(deviceNames1));
       System.out.println(countDeviceNames(deviceNames2));
       // System.out.println(countDeviceNames(deviceNames3));
    }

    public static List<String> countDeviceNames(List<String> deviceNames) {
        Map<String, Integer> holder = new LinkedHashMap<>();
        for (int i = 0; i < deviceNames.size(); i++) {
            if(holder.containsKey(deviceNames.get(i))){
                holder.put(deviceNames.get(i),holder.get(deviceNames.get(i))+1);
                deviceNames.set(i, deviceNames.get(i) + holder.get(deviceNames.get(i)));
            } else {
                holder.put(deviceNames.get(i),0);
            }}
        return deviceNames;
//return null;
    }}

