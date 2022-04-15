import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class T3_LinkedList_and_Queue {
    // LinkedList is a class
    // List and Queue are interfaces.
    // LinkedList implements multiple interfaces(List and Queue)

    public static void main(String[] args) {
        // Queue: FIFO
        // Queue is an interface and can be implemented with Arraylist, LinkedList and PriorityQueue
        Queue<Integer> queue = new LinkedList<>();
        // Queue<Integer> q1 = new ArrayDeque<>();
        // Queue<Integer> pq = new PriorityQueue<>(); // will keep the order ascending
        // Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a); // descending order

        
        System.out.println(queue.add(6)); // return true if added add throws exception when no more elements can be added to the queue 
        System.out.println(queue.offer(51)); // offer return true or false and dont throw exception
        queue.offer(4);
        queue.offer(3);
        System.out.println(queue);

        queue.offer(200);
        queue.offer(250);
        queue.offer(300);
        queue.offer(5);
        System.out.println(queue);

        // Element from start is removed as it is FIFO:
        // remove throws an exception when queue is empty, where as poll return null.
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue);

        System.out.println(queue.element()); // Throw exception if queue is empty 
        System.out.println(queue.peek()); // return null if queue is empty

        // * It is recomended to use offer, poll, peek (insted of add, remove, element)
    }
}
