public class Solution {

	public static void insertionSort(int n , int[] arr) {
		
        // 1st Solution -->
//         for (int i = 0; i < n - 1; i++) {
//             for (int j = i + 1; j > 0; j--) {
//                 if (arr[j] < arr[j - 1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j-1];
//                     arr[j-1] = temp;
//                 }
//                 else{
//                     break;
//                 }
//             }
//         }
        
        // 2nd Solution -->
        for(int i = 1;i<n;i++){
            int temp = arr[i];
            int j;
            for(j = i-1;j>=0;j--){
                
                if(arr[j] > temp){
                    // right shift krrhe hai 1 se
                    arr[j+1] = arr[j]; // shift krne ke liye aage waale element me copy krdiya
                }
                else{
                    // ruk jao
                    break;
                }
            }
            // jis jagah pr aapko element daalna hai, hmara j usse 1
            // peeche hoga
            arr[j+1] = temp;
        }
        
	}
}
