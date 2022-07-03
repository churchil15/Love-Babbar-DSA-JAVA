import java.util.*;

public class Solution {
	
	public static List<Integer> qSort(List<Integer> arr, int start, int end){

        // base case
        if(start>=end){
            return;
        }

        // partition
        int p = partition(arr, start, end);

        // left part sort krenge
        return qSort(arr, start, p-1);

        // right part sort krenge
        return qSort(arr, p+1, end);
		
		
    }

    public static int partition(List<Integer> arr, int start, int end){

        // hmne start element ko hi pivot maan liya hai
        int pivot = arr.get(start);

        // count krrhe hi kitne elements chote hai pivot se
        int cnt = 0;
        for(int i = start+1; i<end; i++){
            
            if(arr.get(i) <= pivot){
                cnt++;
            }

        }

        // formula for finding pivot right index
        int pivotIndex = start + cnt;

        // pivot element ko uske right index pr daal do
//         int temp = arr[start];
//         arr[start] = arr[pivotIndex];
//         arr[pivotIndex] = temp;
		Collections.swap(arr, start, pivotIndex);

        // left and right waala part smbhal lete hai
        int i = start;
        int j = end;

        while(i < pivotIndex && j > pivotIndex){

            while(arr.get(i) <= pivot){
                i++;
            }

            while(arr.get(j) > pivot){
                j--;
            }

            if(i < pivotIndex && j > pivotIndex){
//                 int temp2 = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp2;
				Collections.swap(arr, i, j);

                i++;
                j--;
            }
        }

        return pivotIndex;

    }
	
    public static List<Integer> quickSort(List<Integer> arr){
        
		return qSort(arr, 0, arr.size()-1);
    }
}
