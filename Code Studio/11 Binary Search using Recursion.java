public class Solution { 
	
	public static int solve(int[] arr, int start, int end, int key){

        // Base Case
        if(start > end){
            return -1;
        }

        int mid = start + (end - start)/2;
   
        if(arr[mid] == key){
            return mid;
        }

        if(arr[mid] < key){
            return solve(arr, mid+1, end, key);
        }
        else{
            return solve(arr, start, mid-1, key);
        }

    }

    public static int binarySearch(int[] arr, int x) {
    	
		int ans = solve(arr, 0, arr.length-1, x);
		
		return ans;
    }

}
