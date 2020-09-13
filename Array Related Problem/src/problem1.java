
import java.util.Arrays;
import java.util.Scanner;


public class problem1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];
        System.out.println("please Enter Five Numbers: ");
        for(int i = 0; i < num.length ; i++){
          num[i] = input.nextInt();
        }
        String i;
        System.out.println(Arrays.toString(num));
    }
  
}
