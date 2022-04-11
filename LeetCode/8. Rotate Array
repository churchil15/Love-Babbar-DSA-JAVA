import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
               
        
        // Ek temp array jike andar hm elements daal rhe hai nums se utha ke
        int[] temp = new int[nums.length];
        
               
        for(int i = 0;i<nums.length;i++){
            
            temp[(i+k)%nums.length] = nums[i];
        }
        
        // phir temp ke elements ko copy krdo nums me
        for(int i = 0;i<nums.length;i++){
            
            nums[i] = temp[i];
        }
        
        
    }
}
