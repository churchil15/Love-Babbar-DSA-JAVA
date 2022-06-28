public class Solution {
    
    public static void bubbleSort(int[] arr, int n) {   
        
        for(int i = 0;i<n-1;i++){
            // for round 0 to n-1
            
            boolean swapped = false;
            
            for(int j = 0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    swapped = true;
                }
            }
            if(swapped == false){
                // already sorted
                break;
            }
        }

    }
}
