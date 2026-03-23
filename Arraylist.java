import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");
        al.remove(0);
        al.remove("Geeks");
        al.set(0, "GFG");
        System.out.println(al);
    }
}
