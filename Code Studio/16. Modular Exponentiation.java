public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        
		int result = 1;
		
		while(n>0){
			
			if((n&1) != 0){  // Odd Condition
				
				result = (result * (x)%m) % m;
			}
			
			x = ((x)%m * (x)%m) % m;
			// ye basically divide by 2 krne ka ek tareeka hai:
			n = n >> 1; // "divide by 2" bits operator se kiya hai, '/' operator se nhi
			
		}
		
		return result;
    }
}
