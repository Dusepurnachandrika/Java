import java.util.Scanner;
public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = n/2;
        for(int i=0;i<=n;i++){
            if(i==c){
                for(int j=0;j<n;j++){
                    System.out.print("+");
                }
                System.out.println();
            }
            else{
                for(int j=0;j<c;j++){
                    System.out.print(" ");
                }
                System.out.println("+");
            }
        }
    }
}
