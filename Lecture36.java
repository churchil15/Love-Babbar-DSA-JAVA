public class Lecture36 {

    // public static void quickSort(int[] arr, int start, int end){

    //     // base case
    //     if(start>=end){
    //         return;
    //     }

    //     // partition
    //     int p = partition(arr, start, end);

    //     // left part sort krenge
    //     quickSort(arr, start, p-1);

    //     // right part sort krenge
    //     quickSort(arr, p+1, end);

        
    // }

    // public static int partition(int[] arr, int start, int end){

    //     // hmne start element ko hi pivot maan liya hai
    //     int pivot = arr[start];

    //     // count krrhe hi kitne elements chote hai pivot se
    //     int cnt = 0;
    //     for(int i = start+1; i<end; i++){
            
    //         if(arr[i] <= pivot){
    //             cnt++;
    //         }

    //     }

    //     // formula for finding pivot right index
    //     int pivotIndex = start + cnt;

    //     // pivot element ko uske right index pr daal do
    //     int temp = arr[start];
    //     arr[start] = arr[pivotIndex];
    //     arr[pivotIndex] = temp;

    //     // left and right waala part smbhal lete hai
    //     int i = start;
    //     int j = end;

    //     while(i < pivotIndex && j > pivotIndex){

    //         while(arr[i] <= pivot){
    //             i++;
    //         }

    //         while(arr[j] > pivot){
    //             j--;
    //         }

    //         if(i < pivotIndex && j > pivotIndex){
    //             int temp2 = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = temp2;

    //             i++;
    //             j--;
    //         }
    //     }

    //     return pivotIndex;

    // }

    public static int partition(int[] a, int left, int right) {
        int pivot = a[left];
        while(left<=right) {
            while(a[left] < pivot)
                left++;
            while(a[right] > pivot)
                right--;
            if(left<=right) {
                int tmp = a[left];
                a[left] = a[right];
                a[right] = tmp;
                left++;
                right--;
            }
        }
        return left;
    }
    public static void quickSort(int[] a, int i, int j) {
       int idx = partition(a, i, j);
       if(i < idx-1) {
        quickSort(a, i, idx-1);
        }
       if(j > idx) {
        quickSort(a, idx, j);
        }
    }

    public static void main(String[] args){
        
        int[] arr = {2,4,1,6,9,9,9,9,9,9};
        int size = 10;

        quickSort(arr, 0, size-1);

        for(int i = 0;i<size;i++){
            System.out.print(arr[i] + " ");
        }


    }
}
