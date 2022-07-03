import java.util.ArrayList;

public class Solution 
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int start = m+1;
        int end = arr.size()-1;

        while(start<=end){
            // Collections.swap(arr, start, end);

            // Swapping
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);

            start++;
            end--;
        }
    }
}
