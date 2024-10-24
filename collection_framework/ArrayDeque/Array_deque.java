package collection_framework.ArrayDeque;

import java.util.*;;

public class Array_deque {
    public static void main(String[] args) {
        // both sie travershal , both side peak pool
        ArrayDeque<Integer> a_d = new ArrayDeque<>();
        a_d.offerFirst(12);// add front
        a_d.offer(222);// simply add end
        a_d.offerFirst(56);
        a_d.offerLast(33);// add last

        System.out.println(a_d);

        System.out.println(a_d.pollFirst());
        System.out.println(a_d.pollLast());
        System.out.println(a_d);

        System.out.println(a_d.peekFirst());
        System.out.println(a_d.peekLast());
    }

}
