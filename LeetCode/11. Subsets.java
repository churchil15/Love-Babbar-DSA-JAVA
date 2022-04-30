class Solution {
    
    public static void solve(int[] nums, List<Integer> output, int index, List<List<Integer>> ans){
        
        // base case
        if(index >= nums.length){
            
            ans.add(new ArrayList<>(output));
            return;
        }
        
        // exclude
        solve(nums, output, index+1, ans);        
        
        // include
        int element = nums[index];
        output.add(element);
        solve(nums, output, index+1, ans);
        output.remove(output.size() - 1); // very important to remove the element you added before continuing.

    }
    
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        // List<Integer> output = new ArrayList<>();  
        
        int index = 0;
        
        // output array issform me isliye bhej rhe hai kyuki hmko "ans" List ke andar elements List<Integer>
        // type ke daalne hai, ArrayList<Integer> type ke nhi
        solve(nums, new ArrayList<>(), index, ans);
        
        return ans;
    }
}
