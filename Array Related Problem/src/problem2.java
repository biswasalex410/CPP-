
import java.util.Scanner;


public class problem2 {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int[] num = new int[5];
        System.out.println("please Enter Five Numbers: ");
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }

        int max = num[0];
        for(int i = 1; i < 5; i++){
            if( max < num[i]){
                max = num[i];
            }
        }
        System.out.println("Maximum: "+max);
    }
}
