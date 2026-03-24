import java.util.*;
public class Abstractlist {
    public static void main(String[] args) {
        AbstractList<Integer> a = new LinkedList<>();
        a.add(1);
        a.add(2);
        a.add(1);
        a.add(4);
        a.add(5);
        a.remove(3);
        System.out.println(a);
        int lastindex = a.lastIndexOf(1);
        System.out.println(lastindex);
        int last =  a.lastIndexOf(6);
        System.out.print(last);
    }
}
