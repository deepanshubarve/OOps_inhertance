package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {

        Set<Integer> num = new HashSet<>();

        num.add(20);
        num.add(2);
        num.add(34);
        num.add(21);
        num.add(29);
        num.add(30);
        num.add(10);
        System.out.println(num);

        //add duplicate
        num.add(20);

        //checking element in collection
        boolean res10 = num.contains(10);
        boolean res99 = num.contains(99);
        System.out.println("Contain 10 "+ res10);
        System.out.println("Contain 99 "+ res99);

        //Removing a element
        boolean res = num.remove(10);
        System.out.println(res);
        System.out.println(num);

        int size = num.size();
        System.out.println(size);

        //Q Iterator
        Iterator<Integer> it = num.iterator();
        while (it.hasNext()){
            Integer next = it.next();
            System.out.println(next);
        }

        System.out.println(num.isEmpty());

        //clear the set
        num.clear();
        System.out.println(num);

        System.out.println(num.isEmpty());
    }
}
