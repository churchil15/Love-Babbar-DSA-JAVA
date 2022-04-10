import java.util.*;

public class Lecture20 {

    public static ArrayList<Integer> reverse(ArrayList<Integer> arr){
        
        int start = 0;
        int end = arr.size()-1;

        while(start<=end){
            // Collections.swap(arr, start, end);

            // Swapping
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);

            start++;
            end--;
        }

        return arr;
    }

    public static void print(ArrayList<Integer> arr){

        for(int i = 0;i<arr.size();i++){
            System.out.print(arr.get(i) + " ");
        }

    }


    // Merge 2 Sorted Array -->
    public static void merge(int[] arr1, int[] arr2, int[] arr3){

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<arr1.length && j<arr2.length){

            if(arr1[i]<arr2[j]){
                arr3[k] = arr1[i];
                i++;
                k++;
            }
            else {
                arr3[k] = arr2[j];
                j++;
                k++;
            }

        }

        // Copy arr1[] ke remaining elements 
        // iska mtlb abhi bhi arr1[] ke andar elements bache hue hai
        while(i<arr1.length){
           arr3[k] = arr1[i]; 
           i++;
           k++;
        }

        // Copy arr2[] ke remaining elements 
        // iska mtlb abhi bhi arr2[] ke andar elements bache hue hai
        while(j<arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args){

        System.out.println("Lecture 20\n");

        ArrayList<Integer> arr = new ArrayList<Integer>();

        arr.add(11);
        arr.add(7);
        arr.add(3);
        arr.add(12);
        arr.add(4);

        ArrayList<Integer> ans = reverse(arr);

        System.out.print("Printing reverse array: ");
        print(ans);        
        System.out.println("\n");



        // Merge 2 Sorted Array -->
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6};

        // yha pr ek array create ho jayega jiki length 8 hai aur hr index pr elements saare 0 hai 
        int[] arr3 = new int[8];

        merge(arr1, arr2, arr3);

        System.out.print("Merged Array is: ");
        for(int i = 0;i<arr3.length;i++){
            System.out.print(arr3[i] + " ");
        }


    }
}
