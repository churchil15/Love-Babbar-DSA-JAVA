import java.lang.Math;

class Solution {
    public boolean isPowerOfTwo(int n) {
        
        
        // Brute Force --> 
//         for(int i = 0; i <= 30; i++){
            
//             int ans = (int)(Math.pow(2, i));
            
//             if(ans == n){
//                 return true;
//             }
//         }
//         return false;
        
        
        
        // Improved Brute Force -->
        int ans = 1;
        
        for(int i = 0; i <= 30; i++){
            
            if(ans == n){
                return true;
            }
            
            if(ans < Integer.MAX_VALUE/2)
            ans = ans * 2;
            
        }
        return false;
    }
}
