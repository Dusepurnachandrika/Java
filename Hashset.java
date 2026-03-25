import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.remove(4);
        System.out.println(hs);
        Iterator<Integer> it = hs.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        LinkedHashSet<Integer> l = new LinkedHashSet<>();
        l.add(1);
        l.add(2);
        l.add(2);
        l.add(3);
        l.remove(3);
        l.remove(4);
        System.out.println(l);
        Iterator i = l.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
    }
}
