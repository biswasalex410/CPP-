
import java.util.Scanner;


public class problem5 {
        public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int sum = 0;
        int[] num = new int[5];
        System.out.println("please Enter Five Numbers: ");
        for(int i = 0; i < num.length ; i++){
          num[i] = input.nextInt();
        }
        for (int i = 0; i < num.length ; i++){
            sum = sum + num[i];
        }
        System.out.println("Sum of Array is: "+sum);
    }
    
}
