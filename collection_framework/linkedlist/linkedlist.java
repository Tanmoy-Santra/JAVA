package collection_framework.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class linkedlist {
    public static void main(String[] args) {
        // implements from the the Queue
        Queue<Integer> l = new LinkedList<>();
        l.offer(12);
        l.offer(121);
        l.offer(123);
        l.offer(152);

        System.out.println(l);

        System.out.println(l.peek());

    }

}
