import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Queeue {

    public static void main(String[] args) {
        // ArrayList<Integer> al = new ArrayList<>() ;
        // Stack<Integer> st = new Stack<>();
        // Queeue<Integer> qt = new Queeue() ;

        // Using ArrayDeque to implement Queue
        //  Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue = new ArrayDeque<>();

        // Add elements to the queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);

        System.out.println(queue.size());

        // Display the queue
        System.out.println("Queue using ArrayDeque: " + queue);

        queue.remove();
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

        System.out.println(queue.peek());
    }
}
