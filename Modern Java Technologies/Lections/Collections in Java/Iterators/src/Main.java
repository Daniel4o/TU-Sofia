import java.util.ArrayList;
import java.util.Iterator;

// Iterator
// Allow to visit each element in the container one by one
// Can be available to all the collection classes

// It uses 3 methods
// hasNext() - boolean
// next();
// remove();
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        int counter = 0;
        for(int i =0 ;i <6;i++) {
            counter +=15;
            numbers.add(counter);
        }
        // Getting Iterator from ArrayList to traverse elements
        Iterator<Integer> itr = numbers.iterator();
        while(itr.hasNext()) {
        int x = itr.next();
            System.out.println("Before condition: " + x);
            if(x% 2 == 0) itr.remove();
            System.out.println(numbers);
        }
    }
}
