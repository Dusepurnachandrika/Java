import java.util.*;
public class Arraydeque {
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<Integer>();
        d.add(1);
        d.addFirst(2);
        d.addLast(3);
        d.offer(4);
        d.offerFirst(5);
        d.offerLast(6);
        System.out.println("ArrayDeque: " + d);
        System.out.println("The first element is: " + d.getFirst());
        System.out.println("The last element is: " + d.getLast());
        System.out.println("Removed element using pop(): " + d.pop());
        System.out.println("Removed element using poll(): " + d.poll());
        System.out.println("Removed element using pollFirst(): " + d.pollFirst());
        System.out.println("Final Deque: " + d);
    }
}
