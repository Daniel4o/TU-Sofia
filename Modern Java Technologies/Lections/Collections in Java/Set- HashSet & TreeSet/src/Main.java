import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// Set is an interface which extends Collection interface
// It cannot have duplicates

//HashSet: Implementation
// It stores values in unordered fashion

// TreeSet: Implementation
// It store values in ascending order

public class Main {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(23);
        hashSet.add(4);
        // It will not store the same element
        hashSet.add(4);
        hashSet.add(10);

        for (int element : hashSet)
            System.out.println(element + " ");


        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(23);
        treeSet.add(4);
    // It will not store the same element
        treeSet.add(4);
        treeSet.add(10);

        for (int element : hashSet)
            System.out.println(element + " ");
    }
}
