import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class learnPriorityQueue {
    public static void main(String[] args) {
        // Queue<Integer> pq = new PriorityQueue<>();

        // pq.offer(150);
        // pq.offer(120);
        // pq.offer(110);
        // pq.offer(140);
        // System.out.println(pq);
        // System.out.println(pq.poll());
        // System.out.println(pq);
        // System.out.println(pq.peek());
        
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(150);
        pq.offer(120);
        pq.offer(110);
        pq.offer(140);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.peek());

    }
}
