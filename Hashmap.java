import java.util.*;
public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("shreya", 25);
        hashMap.put("pooja", 30);
        hashMap.put("aishwarya", 35);
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        HashMap<Integer, String> hm1 = new HashMap<>();
        HashMap<Integer, String> hm2 = new HashMap<>();
        hm1.put(1, "name1");
        hm1.put(2, "name2");
        hm1.put(3, "name3");
        System.out.println(hm1);
        hm2.put(1, "name1");
        hm2.put(2, "name2");
        hm2.put(3, "name3");
        System.out.println(hm2);
        hm1.put(2, "name");
        System.out.println(hm1);
        hm1.remove(3);
        System.out.println(hm1);
        for (Map.Entry<Integer, String> e : hm1.entrySet())
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
}
}

