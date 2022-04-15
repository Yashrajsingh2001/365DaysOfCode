import java.util.ArrayDeque;

public class T5_ArrayDeque {
    public static void main(String[] args) {
        // It implements queue, so all methods of queue are available in this.
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(1);
        adq.offer(5);
        adq.offer(3);
        adq.offer(7);
        System.out.println(adq);

        adq.offerFirst(20);
        adq.offerLast(99);
        System.out.println(adq);
        // we also have add, addFist and addLast

        System.out.println(adq.peek()); // adq.remove()
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());
        System.out.println(adq);

        
        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());
        System.out.println(adq);
        // similarly we have remove, removeFirst and removeLast
    }
}
