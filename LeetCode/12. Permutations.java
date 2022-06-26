class Solution {
    public static void solve(int[] nums, List<List<Integer>> ans, int index){
        
        // base case
        if(index >= nums.length){
            
            List<Integer> output = new ArrayList<>();
            for(int i = 0;i<nums.length;i++){
                
                output.add(nums[i]);
            }

            ans.add(output);
            return;
        }
        
        for(int i = index;i<nums.length;i++){
            int temp = nums[index];
            nums[index] = nums[i];
            nums[i] = temp;
            
            solve(nums, ans, index+1);
            
            // backtracking (again swapping to convert it into the original array)
            int temp2 = nums[index];
            nums[index] = nums[i];
            nums[i] = temp2;
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        solve(nums, ans, index);
        return ans;
        
    }
}
