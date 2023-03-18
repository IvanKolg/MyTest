package Учебная.Collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addLast(3);
        deque.addLast(5);
        deque.addLast(7);
        deque.offerFirst(1);
        deque.offerLast(8);
        System.out.println(deque);


        System.out.println(deque.removeFirst());
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

        System.out.println(deque.removeFirst());
    }
}
