
import java.util.Scanner;

public class problem4
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Enter Any number: ");
        x = input.nextInt();
        System.out.println(split(x[]));
    }
    
    public static void split(int a[]) {
        int j = -1, k = -1;
        int N[] = new int [a.length];
        int P[] = new int [a.length];
        for (int i = 0; i<a.length; i++){
            if(a[i]<0)
                N[++j] = a[i];
            else 
               P[++k] = a[i];
       }
        System.out.println("Array with Negative values: ");
        if(j>=0){
            for(int i = 0; i<=j; i++){
                System.out.println(N[i]+ " ");
            }
            System.out.println();
        }
        else 
            System.out.println("Not avialable");
        
        System.out.println("Array with Positive values: ");
        if(k>=0){
            for(int i = 0; i<=k; i++){
                System.out.println(P[i]+ "");
            }
            System.out.println();
        }
        else
            System.out.println("Not avialable");
    }

    private static class x {

        public x() {
        }
    }
}