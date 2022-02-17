import java.util.*;
import java.lang.Math;

public class Lecture6 {
    public static void main(String[] args){
        System.out.println("Lecture 6");
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n");
        int n = sc.nextInt();


        // Decimal to Binary Conversion
        // long ans = 0;
        // int i = 0;
        // while(n!=0){

        //     int bit = n & 1;

        //     ans = ans + (bit * (long)(Math.pow(10, i)));

        //     n = n>>1;
        //     i++;
        // }

        // System.out.println("Answer is: " + ans);



        // Binary to Decimal Conversion
        long ans = 0;
        int i = 0;
        while(n!=0){
            
            int bit = n & 1;

            if(bit == 1){
                ans = ans + (long)(Math.pow(2, i));
            }

            n = n/10;
            i++;
        }

        System.out.println("Answer is: " + ans);
        
    }
}
