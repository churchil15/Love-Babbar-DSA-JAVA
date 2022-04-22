import java.util.Scanner;
import java.lang.System;

public class Lecture31 {

    public static int factorial(int n){

        // Base case 
        if(n == 0){
            return 1;
        }

        // int smallerProblem = factorial(n-1);
        // int biggerProblem = n * smallerProblem;

        // return biggerProblem;


        return n * factorial(n-1);
        
    }

    public static int power(int n){

        // Base Condition
        if( n == 0){
            return 1;
        }

        // int smallerProblem = power(n-1);
        // int biggerProblem = 2 * smallerProblem;

        // return biggerProblem;

        return 2 * power(n-1);
    }

    public static void printCount(int n){

        // Base Condition
        if( n == 0){
            return;
        }

        System.out.print(n + " ");

        printCount(n-1);       

    }

    public static void main(String[] args){
        System.out.println("\nLecture 31");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = sc.nextInt();

        System.out.println("Factorial of the numbers is : " + factorial(n));
        System.out.println("Power of 2 is : " + power(n));
        printCount(n);

        sc.close();

    }
    
}
