import java.util.ArrayList;
import java.util.List;

// List stores values in ordered collection
// It can have duplicate elements
// java.util package and inherits the Collection interface
// Implementation classes are: ArrayList, LinkedList, Stack and Vector

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        for(String fruit:list)
            System.out.println(fruit);
    }
}
