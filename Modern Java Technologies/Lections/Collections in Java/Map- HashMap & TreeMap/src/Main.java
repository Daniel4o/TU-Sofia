import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Map stores values in a Key-Value pair
// Map Properties:
// 1. They contain values based on key
// 2. They are not ordered
// 3. "KEY" should be unique
// 4. "VALUE" can be duplicate

// Map: Interface
// HashMap: Class that implements interface Map
// Elements are stored via hash code calculation
// LinkedHashMap: Stored in order
//TreeMap: Maintains natural order (i.e.alphabetically)
public class Main {
    public static void main(String[] args) {
        Map<String,String> fruits = new HashMap<>();
        fruits.put("red","apple");
        fruits.put("yellow","banana");
        fruits.put("white","radish");
        fruits.put("green","apple");

        System.out.println("Get a Key named red: " + fruits.get("red"));

        System.out.println("\nGet Every key value pairs in the HashMap:");
        for(Map.Entry pairEntry: fruits.entrySet()) {
            System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
        }


    }
}