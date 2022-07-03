class Solution {
    public boolean check(int[] nums) {
        
        int count = 0;
        
        for(int i = 1;i<nums.length;i++){
            
            // ye array ke elements ke comparison ke liye hai
            if(nums[i-1]>nums[i]){
                count++;
            }
        }
        
        // ye last ke cyclic comparison ke liye hai bas 
        if(nums[nums.length-1] > nums[0]){
            count++;
        }
        
        return (count <= 1);
    }
}
