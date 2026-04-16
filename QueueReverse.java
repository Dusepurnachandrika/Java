package QueueExercise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse {
    private static void reverse(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while(q.size()>0){
            s.push(q.remove());
        }
        while(s.size()>0){
            q.add(s.pop());
        }
        
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        System.out.println("Before reversing the queue "+q);
        reverse(q);
        System.out.println("After reversing the queue "+q);
    }
}
