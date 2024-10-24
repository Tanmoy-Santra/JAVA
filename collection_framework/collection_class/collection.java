package collection_framework.collection_class;

import java.util.*;

public class collection {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(891);
        l.add(51);
        l.add(111);
        l.add(41);
        l.add(112);
        l.add(13);
        l.add(111);
        l.add(111);

        System.out.println(l);

        System.out.println(Collections.max(l));
        System.out.println(Collections.min(l));
        System.out.println(Collections.frequency(l, 111));

        Collections.sort(l, Comparator.reverseOrder());
        System.out.println(l);
    }

}
