package QueueExercise;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println("Queue list"+q);
        q.remove();
        System.out.println(q);
        System.out.println(q.remove()+" After removal of element "+q);
        System.out.println(q+"After removal of element "+q.remove());
        System.out.println("Peek value "+q.peek());
        System.out.println("Size of the Queue "+q.size()+q);
    }
}
