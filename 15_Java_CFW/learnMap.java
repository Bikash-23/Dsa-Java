import java.util.Map;
import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.TreeMap;

public class learnMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        // Map<String,Integer> map = new TreeMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four",4);
        System.out.println(map);
        
        map.remove("four");
        System.out.println(map);

        if(!map.containsKey("two")){
            map.put("two", 11);
        }
        System.out.println(map);
        map.putIfAbsent("two", 11);

        for(Map.Entry<String,Integer> e: map.entrySet()) {
            System.out.println(e);
            System.out.println("Key: "+e.getKey());
            System.out.println("HashCose: "+e.hashCode());
            System.out.println("Value: "+e.getValue());
        }
        System.out.println(map.keySet());
        for(String key: map.keySet()){
            System.out.println(key);
        }
        for(Integer val: map.values()){
            System.out.println(val);
        }
        
        System.out.println(map.containsValue(23));
    }
}
