
import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        // int i = 0;
        // while (i < 5) {
        //     System.out.println(i);
        //     i++;
        // }
        Scanner sc = new Scanner(System.in);
        boolean hasLearnt = false;
        while(!hasLearnt){
            System.out.println("went to school, try to learn");
            System.out.println("have you understood");
            hasLearnt = sc.nextBoolean();
        }
        
        // do-while
        int i = 1;
        do {
            System.out.println(i);
            i++;
            if (i == 3) break;
        }while( i <=5);
        System.out.println("out of the loop");
        

        

    }
}
