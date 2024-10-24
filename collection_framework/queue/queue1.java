package collection_framework.queue;

import java.util.*;

public class queue1 {// fifo -> first in fist out

    // queue is an interface which implements by linkedlist
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // add element into queue

        queue.offer(12);
        queue.offer(177);
        queue.offer(121);

        System.out.println(queue.poll());

        System.out.println(queue.peek());

    }

}
