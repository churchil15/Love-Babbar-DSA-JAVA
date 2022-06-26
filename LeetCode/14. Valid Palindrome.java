class Solution {
    
    // Invalid Characters (Non AlphaNumeric characters) ko hta rhe hai 
    public static boolean valid(char ch){
        
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')){
            return true;
        }
        
        return false;
    }
    
    
    // For Checking Palindrome
    public static boolean checkPalindrome(String a){
        
        int start = 0;
        int end = a.length()-1;

        while(start <= end){

            // Convert every character in lower case and then check for Palindrome
            if(Character.toLowerCase(a.charAt(start)) != Character.toLowerCase(a.charAt(end))){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
    
    
    // Main Function
    public boolean isPalindrome(String s) {
        
        // Invalid Characters hta do
        String temp = "";
        
        for(int j = 0;j<s.length();j++){
            
            if(valid(s.charAt(j))){
            
                temp = temp + s.charAt(j);
            }
        }
                
        return checkPalindrome(temp);
        
    }
}
