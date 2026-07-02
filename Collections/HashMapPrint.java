package Collections;
import java.util.*;
public class HashMapPrint {
    public static void main(String[] args) {
        
        Map<String, Integer> map = new HashMap<>();

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);

        Set<String> keySet = map.keySet();
         map.values();

         System.out.println(" Keys: "+keySet.toString());
         System.out.println(" Values: "+map.values());

    }
}
