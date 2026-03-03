import java.util.*;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        String res= sb.reverse().toString();
        if (s.equals(res)){
            System.out.println("palin");
        }
        else{
            System.out.println("non palin");
        }
    }
}
