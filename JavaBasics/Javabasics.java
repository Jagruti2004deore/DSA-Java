// import java.util.*;

public class Javabasics {
    public static void main(String arg[]){
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // //int sum = a + b;
        // int product = a * b;
        // System.out.println(product);/
        int n = 4;
        for(int line=1; line<=n; line++){
            for(int star=1; star<=n-line+1; star++){
               System.out.print("*");
            
            }

            System.out.println();
        }

    }
}

