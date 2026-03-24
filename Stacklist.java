import java.util.*;
public class Stacklist {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
        System.out.println();
        Deque<Integer> d = new ArrayDeque<>();

        d.push(1);
        d.push(2);
        d.push(3);
        d.push(4);
        while(!d.isEmpty()){
            System.out.print(d.pop()+" ");
        }

    }
}
