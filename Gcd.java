public class Gcd {
    static int gcd(int x, int y){
        if(x==0) return y;
        if(y==0) return x;
        if(x==y) return y;
        if(x>y) return gcd(x-y,y);
        return gcd(x,y - x);
        }
    public static void main(String[] args) {
        int a =10,b= 20;
        System.out.println(gcd(a,b));
    }
}
