import java.util.ArrayList;

public class Solution {

	public static int findDuplicate(ArrayList<Integer> arr) {

        // XOR all array elements
	int ans = 0;
        for(int i = 0; i<arr.size(); i++){
            ans = ans^arr.get(i);
        }
        
        // XOR [1, n-1]
        for(int i = 1; i<arr.size(); i++){
            ans = ans^i;
        }
        return ans;
	}
}
