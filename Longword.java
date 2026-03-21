import java.util.*;
public class Longword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String words[] = s.split(" ");
        String longes= "";
        for(String w : words){
            if(w.length() > longes.length()){
                longes = w;
            }

        }
        System.out.println(longes);
    }
}
