import java.util.*;
public class Treeset {
    public static void main(String[] args) {
        NavigableSet<Integer> s = new TreeSet<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(5);
        s.add(3);
        s.add(4);
        s.add(6);
        System.out.println(s);
        s.remove(0);
        System.out.println(s);
        int a= 20;
        System.out.println(s.contains(a));
        System.out.println(s.first()+" "+s.last());
        System.out.println(s.higher(a)+" "+s.lower(a));
        System.out.println(s.pollFirst()+" "+s.pollLast());
        System.out.println(s);
    }
}
