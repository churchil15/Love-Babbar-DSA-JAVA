// Sieve of Eratosthenes
// Time Complexity --> O(n*log(log n))

class Solution {
    public int countPrimes(int n) {
        
        int count = 0;
        
        boolean[] prime = new boolean[n+1];
        Arrays.fill(prime, true);  // Filling the array prime with 'true' value
        
        // prime[0] = prime[1] = false;  // 0 and 1 are not prime hence updating their value with 'false'
        // jab hm hmara loop start hi 2 se krrhe hai to upar waali line ka mtlb hi nhi hai
        
        for(int i = 2;i<n;i++){
            
            if(prime[i]){
                
                count++;
                
                // prime[i] ke table me jitne bhi number aarhe hai unko false krte jaa rhe hai
                for(int j = 2*i;j<n;j=j+i){
                    
                    prime[j] = false;
                }
            }
            
            
        }
        
        return count;
    }
}
