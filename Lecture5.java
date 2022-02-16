import java.util.Scanner;

public class Lecture5 {
    public static void main(String[] args){
        System.out.println("Lecture 5");


        int a = 4;
        int b = 6;

        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(~a);
        System.out.println(a^b);

        System.out.println(17>>1);
        System.out.println(17>>2);
        System.out.println(19<<1);
        System.out.println(21<<2);


        int i = 7;
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i--);
        System.out.println(--i);


        int a1 = 1;
        int b1 = 2;
        
        if(a1-- > 0 || ++b1 >2){
            System.out.println("Stage 1 - Inside if");
        }
        else{
            System.out.println("Stage 2 - Inside else");
        }

        System.out.println(a1 + " " + b1);


        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of n");
        // int n = sc.nextInt();

        // for(int i1 = 1;i1<=n;i1++){
        //     System.out.print(i1 + " ");
        // }
        

        // for(int a2 = 0, b2 = 1; a2>=0 && b2>=1; a2--, b2--){
        //     System.out.println(a2 + " " + b2);
        // }


        // int sum = 0;
        // for(int i2 = 1;i2<=n;i2++){
        //     sum = sum + i2;
        // }
        // System.out.println(sum);


        int first = 0;
        int second = 1;
        int next;

        System.out.print(first + " " + second + " ");

        for(int i3 = 1;i3<=10;i3++){
            next = first + second;
            System.out.print(next + " ");

            // phele second ko transfer kro
            first = second;
            // phir next ko transfer kro
            second = next;
        }


        System.out.println("Enter a number");
        int num = sc.nextInt();

        int isPrime = 1;
        for (int i3 = 2;i3<num;i3++){

            if(num%i3 == 0){
                // System.out.println("Number is not prime");
                isPrime = 0;  
                break;              
            }
        }

        if(isPrime == 0){
            System.out.println("Not prime");
        }
        else{
            System.out.println("Prime number");
        }



        for (int i4 = 0;i4<=5;i4++){
            System.out.print(i4 + " ");
            i4++;
        }

        // for (int i4 = 0;i4<=5;i4--){
        //     System.out.print(i4 + " ");
        //     i4++;
        // }

        // for(int i5 = 0; i5 < 5; i5++){
        //     for(int j = i5;j<=5;j++){
        //         if(i5 + j == 10){
        //             break;
        //         }
        //         System.out.println(i5 + " " + j);
        //     }
        // }


               
                
    }
}
