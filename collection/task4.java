// Practice Question of Queue
package collection;

import java.util.LinkedList;
import java.util.Queue;

public class task4 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        System.out.println("Queue Elements are");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
