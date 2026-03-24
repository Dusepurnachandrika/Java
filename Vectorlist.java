import java.util.*;
public class Vectorlist {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.set(0,100);
        v.remove(1);
        for(int i = 0;i<v.size();i++){
            System.out.print(v.get(i)+" ");
        }
        System.out.println(v);
    }
}
