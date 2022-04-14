import java.util.*;

public class Solution {
    
    static boolean isPossible(ArrayList<Integer> arr, int n, int m, int mid){
        
        int studentCount = 1;
        int pageSum = 0;
        
        for(int i = 0;i<arr.size();i++){
            if(pageSum + arr.get(i) <= mid){
                pageSum = pageSum + arr.get(i);
            }
            else{
                studentCount++;  // yha pr hm ek naya student bnayenge
                if(studentCount > m || arr.get(i) > mid){
                    return false;
                }
                pageSum = arr.get(i);
            }
            if(studentCount > m){
                return false;
            }
        }
        return true;
    }
    
    public static int allocateBooks(ArrayList<Integer> arr, int n, int m) {
        
        int start = 0;
        int sum = 0;
        
        for(int i = 0;i<arr.size();i++){
            sum = sum + arr.get(i);
        }
        
        int end = sum;
        int ans = -1;
        int mid = start + (end - start)/2;
        
        while(start <= end){
            
            if(isPossible(arr, n, m, mid)){
                ans = mid;
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
            mid = start + (end - start)/2;
        }
        return ans;
    }
}
