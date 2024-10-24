package collection_framework.hash_set;

import java.util.*;

public class tree_set {

    public static void main(String[] args) {

        // sorted order
        Set<String> l_h_s = new TreeSet<>();
        l_h_s.add("hi45");
        l_h_s.add("hi");
        l_h_s.add("hi2");
        l_h_s.add("hi3`");

        System.out.println(l_h_s.size());
        System.out.println(l_h_s);

        Iterator<String> it = l_h_s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }

}
