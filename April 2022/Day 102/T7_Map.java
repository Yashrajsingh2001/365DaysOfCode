import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class T7_Map {
    public static void main(String[] args) {
        // HashMap<String, Integer> map = new HashMap<>(); // O(1) time
        // Map<String, Integer> map = new HashMap<>();

        // * Put keys in BST, so it is sorted according to the keys. O(log n) time
        Map<String, Integer> map = new TreeMap<>(); 

        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        map.put("Four", 4);
        map.put("ok", 990);
        map.put("ko", 666);
        System.out.println(map);

        System.out.println(map.put("Four", 6)); // return 4 and update Four value to 6

        System.out.println(map.putIfAbsent("Two", 555)); // return value(2) of the key(Two)
        System.out.println(map.putIfAbsent("Five", 5)); // return null as Five is not present
        System.out.println(map);
        
        map.remove("ok"); // remove it
        map.remove("ko", 66); // will not remove as value is different
        map.remove("ko", 666); // remove it
        System.out.println(map);

        map.replace("One", 111); // replace it
        map.replace("Two", 5, 10); // will not replace it as old value is different
        map.replace("Two", 2, 222); // replace it
        System.out.println(map);

        System.out.println(map.containsKey("One"));
        System.out.println(map.containsValue(8));
        
        System.out.println(map.getOrDefault("One", 100));
        System.out.println(map.getOrDefault("Hundred", 100));
        System.out.println(map);

        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e);
            System.out.println("Key-> "+e.getKey()+" and Value-> "+e.getValue());
        }
        System.out.println();

        for(String key : map.keySet()){
            System.out.println("Key ---> "+key);
        }
        System.out.println();

        for(Integer value : map.values()){
            System.out.println("Value ---> "+value);
        }
        System.out.println();

        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map.isEmpty());


    }
}
