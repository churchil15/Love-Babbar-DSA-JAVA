class Solution {
    
    public static int binarySearch(int n){
        
        int start = 0;
        int end = n;
        long mid = start + (end - start)/2;
        
        int ans = -1;
        while(start<=end){
            
            if(mid*mid > n){
                end = (int)mid - 1;
            }
            
            if(mid*mid < n){
                // agar mid*mid kam aarha hai number se to ye possible solution ho skta hai
                // isiliye isko store krlo
                ans = (int)mid;
                start = (int)mid + 1;
            }
            
            if(mid*mid == n){
                return (int)mid;
            }          
            
            mid = start + (end - start)/2;
        }
        return ans;
    }
    
    public int mySqrt(int x) {
        
        return binarySearch(x); 
        
    }
}
