package collection;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("first");
        queue.add("second");
        queue.add("third");

        System.out.println("Queue Elements");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Retrieves and remove the head
        }
    }
}
