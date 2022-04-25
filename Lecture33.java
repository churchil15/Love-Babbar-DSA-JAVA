import java.util.Scanner;

public class Lecture33 {

    public static boolean isSorted(int[] arr, int index){

        // Base Cases
        if(index == arr.length || arr.length <= 1){
            return true;
        }

        // Array is sorted or not
        if(arr[index - 1] > arr[index]){
            return false;
        }

        // Reccurence relation
        else{
            boolean remainingPart = isSorted(arr, index+1);
            return remainingPart;
        }

    }


    public static int calcSum(int[] arr, int size){

        // Base case
        if(size == 1){
            return arr[0];
        }

        return getSum(arr, 0, size, 0);
    }

    public static int getSum(int[] arr, int index, int size, int sum){

        // Base Case
        if(index == size){
            return sum;
        }

        int currSum = sum + arr[index];

        return getSum(arr, index+1, size, currSum);
    }


    public static boolean linearSearch(int[] arr, int index, int key, int size){

        // Just for Explanation

        // System.out.println("\nSize of the array is: " + size + "\n");
        // for(int i = index;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        // }


        // Base case
        if(size == 0){
            return false;
        }

        if(arr[index] == key){
            return true;
        }

        return linearSearch(arr, index + 1, key, size-1);
    }


    public static boolean binarySearch(int[] arr, int start, int end, int key){

        // Base Case
        if(start > end){
            return false;
        }

        int mid = start + (end - start)/2;
   
        if(arr[mid] == key){
            return true;
        }

        if(arr[mid] < key){
            return binarySearch(arr, mid+1, end, key);
        }
        else{
            return binarySearch(arr, start, mid-1, key);
        }

    }

    public static void main(String[] args){
        
        int[] arr = {2 ,4 ,15 ,17 ,25};
        int[] arr1 = {3,5,1,6,5,2};


        // Question 1
        boolean ans = isSorted(arr, 1);

        if(ans){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is not Sorted");
        }


        // Question 2
        int sum = calcSum(arr, 5);
        System.out.println("Sum of the array is: " + sum);


        // Question 3 -- Linear Search
        // System.out.println("Enter element to search");

        Scanner sc = new Scanner(System.in);
        // int key = sc.nextInt();

        // boolean ans1 = linearSearch(arr1, 0, key, 6);

        // if(ans1){
        //     System.out.println("Element Present");
        // }
        // else{
        //     System.out.println("Element is Absent");
        // }


        // Binary Search using Recursion
        int[] arr3 = {2,4,6,10,14,18};

        System.out.println("Enter element to search");
        int key2 = sc.nextInt();

        boolean ans2 = binarySearch(arr3, 0, 5, key2);

        if(ans2){
            System.out.println("Element Present");
        }
        else{
            System.out.println("Element is Absent");
        }

        sc.close();
        
    }


}
 