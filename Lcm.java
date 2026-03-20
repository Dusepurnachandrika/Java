public class Lcm {
    public static void main(String[] args) {
        int a = 10,b = 15;
        int res = (a>b)? a:b;
        while (true) { 
            if(res%a==0 && res%b==0){
                break;
            }
            res++;
        }
        System.out.println("LCM of two numbers "+res);
    }
}
