class Solution {
    public String removeOccurrences(String s, String part) {
        
        
        // 16ms
//         while(s.indexOf(part) >= 0){
            
//             s = s.replaceFirst(part, "");
//         }
        
//         return s;
        
        
        
        
        // 3ms
//         StringBuilder sb = new StringBuilder(s);
        
//         boolean flag = true;
        
//         while(flag){
            
//             if(sb.indexOf(part) < 0){
                
//                 flag = false;
//             }
//             else{
                
//                 sb.delete(sb.indexOf(part), sb.indexOf(part) + part.length());
//             }
             
//         }
        
//         return sb.toString();
        
        
        
        
        // 2ms
        StringBuffer text = new StringBuffer(s);
        
        while(s.indexOf(part) >= 0){
            
            s = text.replace(s.indexOf(part), s.indexOf(part) + part.length(), "").toString();
            
        }
        
        return s;
        
    }
}
