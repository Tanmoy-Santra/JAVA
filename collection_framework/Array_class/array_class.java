package collection_framework.Array_class;

import java.util.*;

public class array_class {
    public static void main(String[] args) {
        int[] a = { 1, 3, 13, 44, 5, 6, 0 };
        Arrays.sort(a);
        for (int i : a) {
            System.out.println(i);
        }
        int index = Arrays.binarySearch(a, 5);
        System.out.println("index " + index);

        int[] aa = new int[5];
        Arrays.fill(aa, 999);
        for (int j : aa) {
            System.out.print(j + "  ");
        }

    }

}
