 import java.util.Scanner;

public class Lecture32 {

    public static void reachHome(int src, int dest){

        System.out.println("Source is " + src + " Destination is " + dest);
        // base case
        if(src == dest){
            System.out.println("Pauch gaya");
            return;
        }

        // processing
        src++;
        
        // recursive call
        reachHome(src, dest);
    }

    public static int fibonacci(int n){

        // Base cases -
        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        // reccurrence relation
        int ans = fibonacci(n-1) + fibonacci(n-2);

        return ans;
    }

    public static void sayDigit(int n, String[] arr){

        // Base case
        if(n==0){
            return;
        }

        // processing
        int digit = n%10;
        n = n/10;

        // reccurrence relation
        sayDigit(n, arr);

        System.out.print(arr[digit] + " ");
    }

    public static void main(String[] args){

        // int dest = 10;
        // int src = 1;

        // reachHome(src, dest);

        Scanner sc = new Scanner(System.in);
        
        // System.out.println("Enter the term you want in fibonacci series");
        // int n = sc.nextInt();
        
        // System.out.println(n + "th term is " + fibonacci(n));

        System.out.println("Enter number");
        int n1 = sc.nextInt();

        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        sayDigit(n1, arr);


        sc.close();
        
    }
    
}
