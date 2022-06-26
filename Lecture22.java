import java.util.Scanner;

public class Lecture22 {

    // public static char toLowerCase(char ch){
        
    //     if(ch >= 'a' && ch <= 'z'){
    //         return ch;
    //     }
    //     else{
    //         return Character.toLowerCase(ch);
    //     }

    // }

    public static boolean checkPalindrome(char[] a){
        
        int start = 0;
        int end = a.length-1;

        while(start <= end){

            if(Character.toLowerCase(a[start]) != Character.toLowerCase(a[end])){
                return false;
            }
            else{
                start++;
                end--;
            }
        }

        return true;
    }

    public static char getMaxOccCharacter(String s){

        int[] arr = new int[26];

        // create an array of count of characters
        for(int i = 0;i<s.length();i++){
            
            char ch = s.charAt(i);

            int number = 0;
            
            // Lower Case
            if(ch >= 'a' && ch <= 'z'){
                number = ch - 'a';
            }
            // Upper Case
            else{
                number = ch - 'A';
            }

            arr[number]++;
        }

        // find maximum occ character
        int max = -1;
        int ans = 0;
        for(int i = 0;i<26;i++){
            
            if(max < arr[i]){
                ans = i;
                max = arr[i];
            }
        }

        char finalAns = (char)('a' + ans);
        return finalAns;

    }
    

    public static void main(String[] args){

        char[] ch = {'A', 'b', 'c', 'B', 'a'};
        // char[] ch1 = {'c', 'h', 'u', 'r', 'c', 'h', 'i', 'l'};
        // char[] ch2 = {'N', 'o', 'o', 'n'};

        boolean ans = checkPalindrome(ch);

        System.out.println("\n\nPalindrome or not: ");
        if(ans){
            System.out.println("Yes\n\n");
        }
        else{
            System.out.println("No\n\n");
        }


        System.out.println("Character is " + Character.toLowerCase('b'));
        System.out.println("Character is " + Character.toLowerCase('C'));


        String temp = "";
        char add = 's';
        System.out.println(temp);

        for(int i = 0;i<10;i++){
            temp = temp + add;
        }
        

        System.out.println(temp);
        // String ke liye length()
        System.out.println(temp.length());

        // char[] ke liye length
        System.out.println(ch.length);



        System.out.println("Enter a String");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println("Maximun Occured character in the String is: " + getMaxOccCharacter(str));
        

        sc.close();
      
    }
    
}
