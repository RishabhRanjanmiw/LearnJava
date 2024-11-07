
import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n =sc.nextInt();
        // for (int i =1; i <=10; i++){
        //     System.out.println(n+ " * "+i+" = "+i*n);  
        // }
        for ( int i = 0; i <= 5; i++){
            System.out.println(i);

        
             
        }
        // sum of natural number
        int sum = 0;
      for (int i = 1; i<= n; i++){
        sum = sum + i;
        // System.out.println("Sum is" + sum);
      }
      System.out.println("Sum is" + sum);
    }
}