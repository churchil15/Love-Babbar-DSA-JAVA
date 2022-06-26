import java.lang.Math;

class Solution {
    public int reverse(int x) {
        
        int ans = 0;
        while(x!=0){
            
            int num = x%10;
            
            if(ans > Integer.MAX_VALUE/10 || ans < Integer.MIN_VALUE/10){
                return 0;
            }
            
            ans = (ans * 10) + num;          
            
            x = x/10;
        }
        return ans;
                
    }
}
