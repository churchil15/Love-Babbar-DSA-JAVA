import java.util.ArrayList;

class Solution {
	
	static ArrayList<String> ans = new ArrayList<String>();

	
	public static void solve(String str, String output){
		
		// base case
		if(str.length() == 0){
			if(output.length() > 0){
				ans.add(output);
			}
			return;
		}
		
		// exclude
		solve(str.substring(1), output);
		
		// include
		solve(str.substring(1), output + str.charAt(0));
	}
	
    public static ArrayList<String> subsequences(String str) {
        
		String output = "";
		solve(str, output);
		return ans;
    }
}
