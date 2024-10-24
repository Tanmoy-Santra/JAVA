package collection_framework.ArrayList;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);// initialize 10 memory location. , and after 11th element add the size of array
                 // will be as n+n/2+1 make a new array and copy the old array
        a.add(2);
        a.add(4);
        System.out.println(a);

        // add with index by method overloading

        a.add(1, 5);
        System.out.println(a);

        // add a whole list into the list
        ArrayList<Integer> a_new = new ArrayList<>();
        a_new.add(12);
        a_new.add(111);
        a.addAll(a_new);
        System.out.println(a);

        // get the elemet by index
        System.out.println(a.get(0));

        // remove py position;

        a.remove(1);
        System.out.println(a);

        // remove by giving the value

        a.remove(Integer.valueOf(111));
        System.out.println(a);

        // remove the whole list
        a_new.clear();
        System.out.println(a_new);

        // update the value by index
        a.set(1, 122);
        System.out.println(a);

        // contains check the exsistence of value return tru or false

        System.out.println(a.contains(122));

        // list in loop

        for (int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();

        // for each loop

        for (Integer j : a) {
            System.out.print(j + " ");
        }

        // by iterator
        System.out.println();
        Iterator<Integer> it = a.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + "  ");
        }

    }

}
