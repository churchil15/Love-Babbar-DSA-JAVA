import java.util.Scanner;

public class Lecture8 {

    public static int power(){
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = 1;
        for(int i = 1;i<=b;i++){
            ans = ans * a;
        }
        
        return ans;

    }

    public static boolean even_odd(int num){

        if((num & 1) == 1){
            return false;
        }
        
        return true;
    }

    public static int factorial(int n){
        
        int fact = 1;
        for(int i = n;i>=1;i--){
            fact = fact * i;
        }
        return fact;
    }

    public static int nCr(int n, int r){

        int ans = ( factorial(n) / ( factorial(n-r) * factorial(r) ) );

        return ans;
        
    }

    // Function Signature
    public static void printCounting(int n){

        // Function Body
        for(int i =1;i<=n;i++){
            System.out.print(i + " ");
        }

    }


    // 1 -> Prime no.
    // 0 -> Not a Prime no.
    public static boolean isPrime(int num){

        int i = 2;
        while(i<num){
            if(num%i == 0){
                return false;
            }
            i++;
        }

        return true;
    }

    public static int ap(int num){
        return ((3 * num) + 7);
    }


    public static int setBits(int num){
        int count = 0;
        for(int i = 0;i<32;i++){
            if(((num>>i) & 1) == 1){
                count++;
            }
        }

        return count;
    }


    public static int fibonacci(int num){

        // Edge case
        if(num == 0){
            return 0;
        }

        int first = 0;
        int second = 1;
        int next;
        for(int i = 2;i<num;i++){
            next = first + second;
            first = second;
            second = next;
        }

        return second;
    }

    public static void dummy(int n){
        n++;
        System.out.println("n is " + n);
    }

    public static void main(String[] args){

        // System.out.println();

        // int num = 1;
        // char ch = '1';

        // switch(2*num){

        //     case 2: System.out.println("First");
        //             System.out.println("First again");
        //             break;

        //     case '1': switch(num){
        //                 case 1: System.out.println("Value of num is: " + num);
        //                 break;
        //         }
        //         break;
                    

        //     default: System.out.println("It is default case");

        // }

        // System.out.println();

        

        // System.out.println("Enter the value of a");
        // int a = sc.nextInt();

        // System.out.println("Enter the value of b");
        // int b = sc.nextInt();

        // System.out.println("Enter the operation you want to perform");
        // char op = sc.next().charAt(0);

        // switch(op){

        //     case '+': System.out.println(a + b);
        //               break;

        //     case '-': System.out.println(a - b);
        //               break;
            
        //     case '*': System.out.println(a * b);
        //               break;
            
        //     case '/': System.out.println(a / b);
        //               break;
            
        //     case '%': System.out.println(a % b);
        //               break;

        //     default: System.out.println("Invalid operation");
        // }


        // HomeWork Question-->
        // System.out.println("Enter amount");
        // int amt = sc.nextInt();

        // switch(1){

        //     case (1): 
        //             int notes100 = amt/100;
        //             System.out.println("You will need: " + notes100 + " 100Rs/- notes");
        //             amt = amt % 100;


        //     case (2): 
        //             int notes50 = amt/50;
        //             System.out.println("You will need " + notes50 + " 50Rs/- notes");
        //             amt = amt % 50;

        //     case (3):
        //             int notes20 = amt/20;
        //             System.out.println("You will need " + notes20 + " 20Rs/- notes");
        //             amt = amt % 20;
            
        //     case (4):
        //             int notes1 = amt/1;
        //             System.out.println("You will need " + notes1 + " 1Rs/- notes");
        //             amt = amt % 1;
        // }



        // Functions -->
        // int result = power();
        // System.out.println(result);

        // int result2 = power();
        // System.out.println(result2);


        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int num = sc.nextInt();

        // boolean result2 = even_odd(num);

        // if(result2){
        //     System.out.println("Even number");
        // }
        // else{
        //     System.out.println("Odd number");
        // }


        // System.out.println("Enter the value of n and r"); 
        // int n = sc.nextInt();
        // int r = sc.nextInt();

        // int result3 = nCr(n, r);
        // System.out.println(result3);

        // System.out.println("Enter the value of n"); 
        // int n1 = sc.nextInt();

        // // Function Call
        // printCounting(n1);


        // System.out.println("Enter the value of num"); 
        // int num = sc.nextInt();

        // boolean result3 = isPrime(num);

        // if(result3){
        //     System.out.println("Prime no.");
        // }
        // else{
        //     System.out.println("Not a Prime no.");
        // }


        // Homework-->
        // 1 AP
        // System.out.println("AP is represnented as: " + " 3n + 7");
        // System.out.println("Enter the value of n");
        // int n = sc.nextInt();

        // int result4 = ap(n);
        // System.out.println(result4);


        
        // 2 Number of set Bit
        // System.out.println("Enter the value of a and b");
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int bit_a = setBits(a);
        // int bit_b = setBits(b);

        // System.out.println("Total number of set bits in a and b is: " + (bit_a + bit_b));


        // 3 Fibonacci series
        // System.out.println("Enter a number");
        // int number = sc.nextInt();

        // int n = fibonacci(number);
        // System.out.println(number + "th term of the fibonacci series is: " + n);


        // Pass by Value
        int n = sc.nextInt();
        
        dummy(n);

        System.out.println("number n is " + n);

        sc.close();

    }
    
}
