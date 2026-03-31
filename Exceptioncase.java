public class Exceptioncase {
    

    public static void main(String[] args) {
        int n = 10;
        int m = 0;
        
        try {
            int ans = n / m;
            System.out.println("Answer: " + ans);
        } catch (ArithmeticException e){
            System.out.println("Error: Division by 0!");
        } 
        finally{
            System.out.println("This block always executes.");
        }
        System.out.println("Program continues...");

        
    }
    
    }


    
    
