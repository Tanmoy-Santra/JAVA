package collection_framework.hash_set;

import java.util.*;

public class set {
    public static void main(String[] args) {
        // unique element are only there and order are not define
        // generetate the hash and add it into collection
        Set<Integer> h_s = new HashSet<>();
        h_s.add(34);
        h_s.add(31);
        h_s.add(24);
        h_s.add(34);

        System.out.println(h_s);

        System.out.println(h_s.contains(100));

        h_s.remove(31);
        System.out.println(h_s);

        System.out.println(h_s.isEmpty());

        h_s.clear();
        System.out.println(h_s);
        System.out.println(h_s.size());

    }
}
