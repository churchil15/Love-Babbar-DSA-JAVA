class Solution {
    public int compress(char[] chars) {
        
        int i = 0;
        int ansIndex = 0;
        int n = chars.length;
        
        while(i<n){
            
            int j = i+1;
            
            while(j<n && chars[i] == chars[j]){
                
                j++;
            }
            
            // yha kab aayoge 
            // ya to char array pura traverse krdiya
            // ya fir new/Different character encounter kiya hai
            
            // oldChar store krlo
            chars[ansIndex++] = chars[i];
            
            int count = j-i;
            
            if(count > 1){
                
                // converting counting into single digit and saving in answer
                
                // Ye 2 tareeke hote hai int ko String me convert krne me -->
                // String cnt = String.valueOf(count);
                String cnt = Integer.toString(count);
                
                char[] c = cnt.toCharArray();
                
                for(char ch: c){
                    
                    chars[ansIndex++] = ch;
                }
                
                
            }
            
            // moving to new/Different Character
            i=j;
            
        }
        
        return ansIndex;
    }
}
