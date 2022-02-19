// YT Link --> https://www.youtube.com/watch?v=WR31ByTzAVQ&list=PLDzeHZWIZsTryvtXdMr6rPh4IDexB5NIA&index=3

import java.util.Scanner;

public class Lecture3 {
    public static void main(String[] args){
        System.out.println("Lecture 3");

        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        
        // System.out.println("Hello");

        // System.out.println("Value of n is:" + n);

        // if(a>0){
        //     System.out.println("A is Positive");
        // }
        // else{
        //     System.out.println("A is negative");
        // }

        // System.out.println("Value of a and b is: " + a + " and " +  b);

        // System.out.println("Enter the value of a");
        // int a = sc.nextInt();

        // System.out.println("Enter the value of b");
        // int b = sc.nextInt();

        // if(a>b){
        //     System.out.println("A is greater");
        // }

        // if(b>a){
        //     System.out.println("B is greater");
        // }

        // if(a>0){
        //     System.out.println("A is positive");
        // }
        // else{
        //     if(a<0){
        //         System.out.println("A is negative");
        //     }
        //     else{
        //         System.out.println("A is equale 0");
        //     }
        // }

        // if(a>0){
        //     System.out.println("A is positve");
        // }
        // else if(a<0){
        //     System.out.println("A is negative");
        // }
        // else{
        //     System.out.println("A is 0");
        // }

        int a1 = 24;
        if(a1>0){
            System.out.println("Love");
        }
        else if(a1==24){
            System.out.println("Lovely");
        }
        else{
            System.out.println("Babbar");
        }

        System.out.println(a1);


        // System.out.println("Enter any charater");
        // char ch = sc.next().charAt(0);

        // if(ch >= 97 && ch <= 122 ){
        //     System.out.println("This is Lowercase");
        // }
        // else if(ch >= 65 && ch <= 90){
        //     System.out.println("This is Uppercase");
        // }
        // else if(ch >= 48 && ch <= 57){
        //     System.out.println("This is numeric");
        // }

        // if(ch >= 'a' && ch <= 'z' ){
        //     System.out.println("This is Lowercase");
        // }
        // else if(ch >= 'A' && ch <= 'Z'){
        //     System.out.println("This is Uppercase");
        // }
        // else if(ch >= '0' && ch <= '9'){
        //     System.out.println("This is numeric");
        // }
        
        System.out.println("Enter n");
        int n = sc.nextInt();

        // int i = 1;
        // while(i<=n){
        //     System.out.print(i + " ");
        //     i++;
        // }

        // int sum = 0;
        // int i = 1;
        // while(i<=n){
        //     sum = sum + i;
        //     i++;
        // }

        // System.out.println(sum);


        // int i = 2;
        // int sum = 0;
        // while(i<=n){
        //     sum = sum + i;
        //     i = i + 2;
        // }
        // System.out.println("Sum of even numbers is: " + sum);

        // System.out.println("Enter temperature in faherenhite");
        // int fah = sc.nextInt();

        // float cel = (5.0f/9.0f) * (fah - 32.0f);

        // System.out.println("Temperature in celsius is: " + cel);


        int i = 2;
        
        while(i<=n-1){

            if(n%i == 0){
                System.out.println("Not Prime");
                i++;
                break;
            }
            else{
                System.out.println("Prime");
                i++;
                break;
            }
        }   


        int row = 0;
        while(row < n){
            int col = 0;
            while(col < n){
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }       
        

        int row1 = 1;
        while(row1 <= n){
            int col1 = 1;
            while(col1 <= n){
                System.out.print(row1 + " ");
                col1++;
            }
            System.out.println();
            row1++;
        }

        sc.close();

    }
}
