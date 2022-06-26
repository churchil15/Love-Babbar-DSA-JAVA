import java.util.*;

public class Lecture16 {
    public static void main(String[] args){
        System.out.println("Lecture 16 for Revision");

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int n = sc.nextInt();

        // int i = 2;
        
        // while(i<=n-1){

        //     if(n%i == 0){
        //         System.out.println("Not Prime");
        //         // i++; Not Neccessary to increment here
        //         break;
        //     }
        //     else{
        //         System.out.println("Prime");
        //         i++;
        //         break;
        //     }
        // }

        // Note --> 1 is a prime number
        // while(i<n){
        //     if(n%i==0){
        //         System.out.println("Not Prime");
        //         System.exit(0);
        //     }
        //     i++;
        // }
        // System.out.println("Prime");     
        

        // int a = 2;
        // int b = 33;

        // System.out.println(Math.max(a,b));
        // System.out.println(Math.min(a,b));


        
        System.out.print(" Enter SIZE of 1D Array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.print(" Enter " + n + " Elements: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        
        System.out.println(" Array Before Sorting is: " + Arrays.toString(arr));
        
        insertionSort(arr, n);
        
        System.out.println(" Array After Sorting is: " + Arrays.toString(arr));

        sc.close();
    }

    
    static void insertionSort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j > 0; j--) {

                if (arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else
                    break;
            }
        }
    }

    
    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    
}

