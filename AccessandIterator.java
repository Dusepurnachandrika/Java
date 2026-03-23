import java.util.*;
public class AccessandIterator {
    public static void main(String[] args) {
        List<Integer> obj = new ArrayList<>();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        System.out.println(obj);
        Integer first = obj.get(0);
        Integer last = obj.get(obj.size()-1);
        System.out.println(first);
        System.out.println(last);

        Collection<Integer> l = new LinkedList<>();
        l.add(10); l.add(20);l.add(30);l.add(40);
        System.out.println(l);
        Iterator<Integer> it = l.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
