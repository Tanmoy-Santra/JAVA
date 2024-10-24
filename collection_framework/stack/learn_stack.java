package collection_framework.stack;

import java.util.*;

public class learn_stack {// lifo -> last in first out
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();
        animal.push("lion");
        animal.push("dog");
        animal.push("horse");
        animal.push("cat");

        System.out.println(animal.peek());// view the top element

        animal.pop();
        System.out.println(animal.peek());
    }
}
