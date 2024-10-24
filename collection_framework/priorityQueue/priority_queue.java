package collection_framework.priorityQueue;

import java.util.*;;

/**
 * priority_queue
 */
public class priority_queue {

    public static void main(String[] args) {

        // default is min_heap now we tryto create max_heap by using comparetor inside
        // prority queue initiliazation
        // Queue<Integer> p_queue = new PriorityQueue<>();
        Queue<Integer> p_queue = new PriorityQueue<>(Comparator.reverseOrder());// max heap
        p_queue.offer(12);
        p_queue.offer(78);
        p_queue.offer(34);

        p_queue.offer(88);

        System.out.println(p_queue);

        System.out.println(p_queue.peek());

        System.out.println(p_queue.poll());

        System.out.println(p_queue);
        System.out.println(p_queue.poll());

        System.out.println(p_queue);

    }
}