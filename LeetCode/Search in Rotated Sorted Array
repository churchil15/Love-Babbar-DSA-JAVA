class Solution {
    
    public static int getPivot(int[] arr){
        
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end - start)/2;

        while(start<end){

            if(arr[mid] >= arr[0]){
                start = mid + 1;
            }
            else{
                end = mid;
            }

            mid = start + (end - start)/2;
        }
        return start;
    }
    
    public static int binarySearch(int[] arr, int s, int e, int key){
        
        int start = s;
        int end = e;
        int mid = start + (end - start)/2;
        
        while(start<=end){
            
            if(arr[mid] == key){
                return mid;
            }
            
            if(key>arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            
            mid = start + (end - start)/2;
        }
        
        return -1;
    }
    
    public int search(int[] nums, int target) {
        
        int pivot = getPivot(nums);
        int n = nums.length;
        
        // BS on Second Line (Second Part)
        if(target >= nums[pivot] && target <= nums[n-1]){
            return binarySearch(nums, pivot, n-1, target);
        }
        // BS on First Line (First Part)
        else{
            return binarySearch(nums, 0, pivot - 1, target);
        }
        
    }
}
