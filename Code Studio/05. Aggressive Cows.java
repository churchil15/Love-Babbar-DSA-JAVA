import java.util.*;
import java.lang.Math;

public class Solution 
{
    
    static boolean isPossible(ArrayList<Integer> stalls, int k, int mid){
        
        int cowCount = 1;
        int lastPos = stalls.get(0);
        
        for(int i = 0;i<stalls.size();i++){
            if(stalls.get(i)-lastPos >= mid){
                cowCount++;
                if(cowCount==k){
                    return true;
                }
                lastPos = stalls.get(i);
            }
        }
        return false;
    }
    
    public static int aggressiveCows(ArrayList<Integer> stalls, int k) 
    {
        Collections.sort(stalls);
        
        int start = 0;
        int maxi = -1;
        for(int i = 0;i<stalls.size();i++){
            maxi = Math.max(maxi, stalls.get(i));
        }
        
        int end = maxi;
        int ans = -1;
        int mid = start + (end-start)/2;
        
        while(start<=end){
            if(isPossible(stalls, k, mid)){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
            mid = start + (end-start)/2;
        }
        return ans;
    }
}
