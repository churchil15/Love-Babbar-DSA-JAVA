public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {      
        
        
        // Direct Method -->
        // return Integer.bitCount(n);
        
        
        // Runtime is 1ms -->
        int count = 0;
        for (int i = 1; i <= 32; i++) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n>>1;
        }
        return count;
        
        
    }
    
}
