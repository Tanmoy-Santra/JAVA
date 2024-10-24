package collection_framework.map;

import java.util.*;

public class map {
    public static void main(String[] args) {
        // stores key value pair
        Map<String, Integer> my_map = new HashMap<>();
        my_map.put("b", 655);
        my_map.put("a", 61);
        my_map.put("a", 61);
        my_map.put("a1", 61);

        System.out.println(my_map);// take only one value no duplicate value ,keys are always unique and pairs are
                                   // add in sorted order

        my_map.putIfAbsent("m", 22);
        System.out.println(my_map);

        if (my_map.containsKey("m")) {
            my_map.remove("m");
        }

        System.out.println(my_map);
        System.out.println();

        for (Map.Entry<String, Integer> e : my_map.entrySet()) {
            System.out.println();
            System.out.print(e + " ");
            System.out.println();
            System.out.print(e.getKey() + " ");
            System.out.println();
            System.out.print(e.getValue() + " ");
        }
        System.out.println();
        System.out.println(my_map.containsKey("a"));
        System.out.println(my_map.containsValue(1));
    }

}
