package Учебная.Collection.Queue;


import javax.sound.midi.Soundbank;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Max");
        queue.add("Dima");
        queue.add("Kolya");
        queue.add("Nikitok");
        queue.add("Vanya");
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}
