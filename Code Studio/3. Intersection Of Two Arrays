// GOT TLE

import java.util.ArrayList;

public class Solution
{
	public static ArrayList<Integer> findArrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m)
    
    {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
	    for(int i = 0;i<n;i++){
            int element = arr1.get(i);
            
            for(int j = 0;j<m;j++){
                
                if(element < arr2.get(j)){
                    break;
                }
                
                if(element == arr2.get(j)){
                    ans.add(element);
                    arr2.set(j, -2); // updating it with any random value so it does not match with any other.
                    break;
                }
                
            }
            
        }
        
        return ans;
        
        
	}
}
