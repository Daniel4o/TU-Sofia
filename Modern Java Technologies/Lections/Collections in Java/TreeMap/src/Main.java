import java.util.TreeMap;

// TreeMap class stores values in a key-value pairs
// It implements the NavigableMap interface and extends AbstractMap class
// It contains only unique elements
// It's not synchronized
// It maintains ascending order (Low to High)
// It cannot have null key but can have null value

public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(2,"Banana");
        treeMap.put(1,"Car");
        treeMap.put(3,"Avocado");

        System.out.println(treeMap);
    }
}
