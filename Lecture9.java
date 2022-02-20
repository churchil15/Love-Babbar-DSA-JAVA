import java.util.Scanner;

public class Lecture9 {

    public static void printArray(int[] arr){

        System.out.println("printing the array");

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }        

        System.out.println("\nprinting done");

    }

    public static int getMin(int[] num, int n){

        int min = Integer.MAX_VALUE;

        for(int i = 0;i<n;i++){
            if(num[i] < min){
                min = num[i];
            }
        }

        // returning min value
        return min;
    }

    public static int getMax(int[] num, int n){

        int max = Integer.MIN_VALUE;

        for(int i = 0;i<n;i++){
            if(num[i] > max){
                max = num[i];
            }
        }

        // returning max value
        return max;
    }

    public static void update(int[] arr, int n){
        
        System.out.println("Inside the function");

        arr[0] = 120;

        for(int i = 0;i<3;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nGoing back to main");
    }

    public static int sumArray(int[] arr, int n){

        int sum = 0;
        for(int i = 0;i<n;i++){
            sum = sum + arr[i];
        }

        return sum;
    }

    public static boolean search(int[] arr, int size, int element){

        for(int i = 0;i<size;i++){

            if(arr[i] == element){
                return true;
            }
            
        }

        return false;
    }

    public static void main (String[] args){
        System.out.println("Lecture 9");

        // int[] dost = new int[10];

        // // Initializing every element with -24
        // Arrays.fill(dost, -24);

        // for(int i = 0;i<dost.length;i++){
        //     System.out.print(dost[i] + " ");
        // }


        // int[] number = new int[15];

        // System.out.println("Value at 0 index: " + number[14]);

        // System.out.println("Value at 20 index: " + number[20]);

        // int[] second = {5, 7, 11};

        // System.out.println("Value at 2 index: " + second[2]);

        // int[] third = new int[15];
        // printArray(third);


        // int[] fourth = new int[10];
        // printArray(fourth);


        char[] ch = {'a', 'b', 'c', 'r', 'p'};
        System.out.println(ch[3]);

        for(int i = 0;i<ch.length;i++){
            System.out.print(ch[i] + " ");
        }

        // double[] firstDouble = new double[5];
        // float[] firstFloat = new float[6];
        // boolean[] firstBoolean = new boolean[9];

        System.out.println("\nEverything is fine");


        
        // Maximum and Minimum of the Array
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the size of the array");
        // int size = sc.nextInt();
        
        // int[] num = new int[100];

        // // taking input
        // System.out.println("Enter " + size + " elements in the array");
        // for(int i = 0;i<size;i++){
        //     num[i] = sc.nextInt();
        // }

        // int max = getMax(num, size);
        // int min = getMin(num, size);
        // System.out.println("Maximum of the array is: " + max);
        // System.out.println("Minimum of the array is: " + min);



        // Scope
        // int[] arr = {1,2,3};

        // update(arr, 3);

        // System.out.println("Printing in main function");
        // for(int i = 0;i<3;i++){
        //     System.out.print(arr[i] + " ");
        // }


        // Home work
        // System.out.println("Enter the size of the array");
        // int size = sc.nextInt();

        // int[] arr = new int[100];

        // System.out.println("Enter " + size + " elements");
        // for(int i = 0;i<size;i++){
        //     arr[i] = sc.nextInt();
        // }

        // int sum = sumArray(arr, size);
        // System.out.println("sum of the elements of the array is: " + sum);


        // Linear Search
        int[] arr = {5, 7, -2, 10, 22, -2, 0, 5, 22, 1};

        System.out.println("Enter the element to search for");
        int key = sc.nextInt();

        boolean found = search(arr, 10, key);

        if(found){
            System.out.println("Element is present");
        }
        else{
            System.out.println("Element is not present");
        }
    }
}
