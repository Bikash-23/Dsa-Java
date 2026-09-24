import java.util.ArrayDeque;

public class learnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque <Integer> adq = new ArrayDeque<>();
        adq.offer(50);
        adq.offerFirst(100);
        adq.offerLast(101);
        System.out.println(adq);
        adq.offer(105);
        System.out.println(adq);
        
        // System.out.println(adq.peek());
        // System.out.println(adq.peekFirst());
        // System.out.println(adq.peekLast());

        // System.out.println(adq.poll());
        // System.out.println(adq);
        // System.out.println(adq.pollFirst());
        // System.out.println(adq);
        System.out.println(adq.pollLast());
        System.out.println(adq);
    }
}
