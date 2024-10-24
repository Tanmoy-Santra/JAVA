package collection_framework.hash_set;

import java.util.*;

public class linke_hash_set {
    public static void main(String[] args) {
        Set<String> l_h_s = new LinkedHashSet<>();
        l_h_s.add("hi");
        l_h_s.add("hi2");
        l_h_s.add("hi3`");
        l_h_s.add("hi45");

        System.out.println(l_h_s.size());
        System.out.println(l_h_s);

        Iterator<String> it = l_h_s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }

}
