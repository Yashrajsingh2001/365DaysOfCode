import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class T4_PriorityQueue {

    public static void main(String[] args) {
        // Queue<Integer> pq = new PriorityQueue<>(); // will keep the order ascending by default
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a); // descending order
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // descending order
        
        /*
        ! Note: it's not necessary that all elements will be shown in an order 
        ! but the first element will always be according to the priority given.
        ! when we will poll/remove the element the oder will again change 
        ! and the element with the priority will come first
        */
        pq.offer(6); 
        pq.offer(1);
        pq.offer(4);
        pq.offer(10);
        pq.offer(7);
        pq.offer(87);
        pq.offer(41);
        pq.offer(187);
        System.out.println(pq);

        /*
        ! NOTE:
        we need to do:
        PriorityQueue<Integer> pq = new PriorityQueue<>(); if we want to use Iterator.

        it can not be done with:
        Queue<Integer> pq = new PriorityQueue<>();
        
        */
        Iterator<Integer> it = pq.iterator();
        while(it.hasNext()){
            pq.poll();
            System.out.println(pq);
        }
    }
}
