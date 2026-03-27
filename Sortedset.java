import java.util.*;
public class Sortedset {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(15);
        set.add(5);
        System.out.println(set.first());
        System.out.println(set.last());
        int a = 20;
        System.out.println(set.contains(a));
        set.remove(5);
        System.out.println(set);
        for(int b:set){
            System.out.print(b+" ");
        }
    }
}
