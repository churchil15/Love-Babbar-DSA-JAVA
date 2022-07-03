import java.util.*;

public class Solution {	
	
	public static void reverse(char[] ch, int i, int j){

        // base case
        if(i>j){
            return;
        }

        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;

        i++;
        j--;

        reverse(ch, i, j);

    }
	
// 	public static String reverse(String str){
		
// 		if (str.isEmpty())
//             return str;
//         //Calling Function Recursively
//         return reverseString(str.substring(1)) + str.charAt(0);
				
// 	}
	
	public static String reverseString(String str) {
		
// 		Approach 1
// 		String rstr = "";
// 		char ch;
		
// 		for(int i = 0;i<str.length();i++){
// 			ch = str.charAt(i);
			
// 			rstr = ch + rstr;
// 		}
		
// 		return rstr;
		
		
// 		Approach 2
		char[] ch = str.toCharArray();
		reverse(ch, 0, ch.length-1);
		
		String s = String.valueOf(ch);
		return s;
		
		
// 		Approach 3
// 		return reverse(str);
	}
}
