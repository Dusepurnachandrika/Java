import java.util.*;
public class Collections {
    public static void main(String[] args) {
        Collection<String> obj = new ArrayList<>();
        obj.add("apple");
        obj.add("mango");
        obj.add("banana");
        System.out.println(obj);
        Collection<String> moreobj = new ArrayList<>();
        moreobj.add("apple");
        moreobj.add("banana");
        obj.addAll(moreobj);
        System.out.println(obj);
        obj.remove("apple");
        obj.removeAll(moreobj);
        System.out.println(moreobj);
        System.out.println(obj);

    }
}
