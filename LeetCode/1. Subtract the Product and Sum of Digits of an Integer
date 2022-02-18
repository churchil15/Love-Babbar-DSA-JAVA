class Solution {
    public int subtractProductAndSum(int n) {
           
        int product = 1;
        int sum = 0;
        while(n!=0){
            product = product * (n%10);
            sum = sum + (n%10);
            n = n/10;
        }
        
        int ans = product - sum;
        return ans;
        

    }
}
