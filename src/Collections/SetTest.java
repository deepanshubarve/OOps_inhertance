package Collections;

import java.util.HashSet;
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

        //how to check element in collection

        boolean res10 = num.contains(10);
        boolean res99 = num.contains(99);
        System.out.println("Contain 10 "+ res10);
        System.out.println("Contain 99 "+ res99);
    }
}
