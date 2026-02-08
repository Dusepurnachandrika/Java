import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =0;
        int b =1;
        while(n-->0){
            System.out.println(a);
            int temp =a+ b;// int temp = b ----> gcd logic 
            a= b;          // b = a%b
            b = temp;      // a = temp
        }
        
    }
}
