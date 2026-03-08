package Basics;

public class Callbyreference {
    void swap(int a,int b){
        int temp = a;
        a = b;
         b= temp;
         System.out.println("a "+a+" b "+b);
    }
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        Callbyreference obj = new Callbyreference();
        System.out.println("x "+x+" y "+y);
        obj.swap(x,y);
        System.out.println("x "+x+" y "+y);

    }
}
