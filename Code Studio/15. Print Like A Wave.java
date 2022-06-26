import java.util.ArrayList;

public class Solution {
	public static int[] wavePrint(int arr[][], int nRows, int mCols) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		for(int col = 0;col<mCols;col++){
			
			if(col%2!=0){
				// odd Index -> Bottom to Top
				
				for(int row = nRows-1;row>=0;row--){
// 					System.out.println(arr[row][col] + " ");
// 					ans[arr[row][col]] = arr[row][col];
					list.add(arr[row][col]);
					
				}
				
			}
			else{
				// 0 or even Index -> Top to Bottom
				for(int row = 0;row<nRows;row++){
// 					System.out.println(arr[row][col] + " ");
// 					ans[arr[row][col]] = arr[row][col];
					list.add(arr[row][col]);
					
				}
			}
			
		}
		
		int[] ans = list.stream().mapToInt(i -> i).toArray();
		return ans;
		
		
	}
}


