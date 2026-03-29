import java.util.*;

public class EnumExample {

    public static void main(String[] args){

        Vector<String> fruits = new Vector<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Getting Enumeration object
        Enumeration<String> e = fruits.elements();

        System.out.println("Elements of Vector:");
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        Hashtable<Integer, String> map = new Hashtable<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        Enumeration<Integer> keys = map.keys();

        System.out.println("Hashtable Keys:");
        while (keys.hasMoreElements()) {
            int key = keys.nextElement();
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
