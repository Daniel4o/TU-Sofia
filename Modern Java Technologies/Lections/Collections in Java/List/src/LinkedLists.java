// LinkedList implements the Collection interface
// It uses a doubly linked list internally to store the elements
// It uses addresses and pointers
// Each element is knows as a node
// It is used for manipulating data
// The doubly linked list contains an extra pointer named previous pointer

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add("Rob");
        ll.add("Alex");
        ll.add("Jose");

        System.out.println(ll);

        Iterator<String> itr = ll.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
