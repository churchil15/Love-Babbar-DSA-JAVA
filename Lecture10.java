public class Lecture10 {

    public static void printArray(int[] arr){

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void swapAlternate(int[] arr){

        int temp;
        for(int i = 0;i<arr.length;i = i+2){

            // Checking of the next element exists or not to perform swapping
            if(i+1<arr.length){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            } 
        }

    }

    public static void main(String[] args){
        System.out.println();

        // int[] arr = {1,2,3,4,5,6};
        int[] arr = {5,2,9,4,7,6,1,0};
        int[] arr2 = {11,33,9,76,43};

        swapAlternate(arr);
        printArray(arr);

        System.out.println();

        swapAlternate(arr2);
        printArray(arr2);

   }
}
