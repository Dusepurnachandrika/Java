public class Pattern1 {
    public static void main(String[] args) {
        int i;
        int j;
        for(i =0;i<4;i++){
            
            for(j =0;j<5;j++){
                if(i==0 || i==3 || j ==0 || j== 4){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
            
        }
        System.out.println();
    }
}
