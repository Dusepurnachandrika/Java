import java.util.*;
public class Linkedlistcollection {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Geeks");
        ll.add("Geeks");
        ll.add(1, "eeks");
        ll.set(1, "For");
        ll.remove(1);
        ll.remove("Geeks");
        System.out.println(ll.get(0));
    }
}
