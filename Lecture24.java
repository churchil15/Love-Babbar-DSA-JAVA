import java.util.Scanner;

public class Lecture24 {

    public static int gcd(int a, int b){

        if(a==0){
            return b;
        }

        if(b==0){
            return a;
        }

        while(a != b){

            if(a>b){

                a = a-b;
            }
            else{

                b = b-a;
            }
        }

        return a;
    }

    public static void main(String[] args){
        System.out.println("Maths for DSA\n\n");

        System.out.println("Enter the values of a and b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is " + ans);


        sc.close();

    }
    
}
