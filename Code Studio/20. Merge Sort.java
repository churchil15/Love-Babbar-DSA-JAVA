public class Solution {
	
	public static void mergeS(int[] arr, int start, int end){

        // base case
        if(start >= end){
            return;
        }

        int mid = start + (end-start)/2;

        // left part sort krna hai
        mergeS(arr, start, mid);

        // right part sort krna hai
        mergeS(arr, mid+1, end);

        merge(arr, start, end);

    }

    public static void merge(int[] arr, int start, int end){

        int mid = start + (end-start)/2;

        int len1 = mid- start + 1;
        int len2 = end - mid;

        int[] first = new int[len1];
        int[] second = new int[len2];

        // copy values
        int k = start;
        for(int i = 0;i<len1;i++){
            first[i] = arr[k++];
        }

        k = mid+1;
        for(int i = 0;i<len2;i++){
            second[i] = arr[k++];
        }

        // merge 2 sorted arrays
        int index1 = 0;
        int index2 = 0;
        int mainArrayIndex = start;

        while(index1 < len1 && index2 < len2){
            if(first[index1] < second[index2]) {
                arr[mainArrayIndex++] = first[index1++];
            }
            else{
                arr[mainArrayIndex++] = second[index2++];

            }
        }

        while(index1 < len1){
            arr[mainArrayIndex++] = first[index1++];
        }
        while(index2 < len2){
            arr[mainArrayIndex++] = second[index2++];
        }
    }
	
	public static void mergeSort(int[] arr, int n) {
		
		mergeS(arr, 0, arr.length-1);

	}
}
