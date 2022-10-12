import java.util.ArrayList;

// ArrayList class uses a dynamic array for storing elements
// It is used for accessing and storing data
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<String> fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Melon");

        System.out.println(fruitList.size());
        fruitList.remove(2);
        // contains returns true/false
        // Has to contain the whole word
        System.out.println(fruitList.contains("Melon"));
        System.out.println(fruitList);

        fruitList.set(0,"Banana");
        System.out.println(fruitList.get(0));
    }
}
