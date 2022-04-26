import java.util.Scanner;

public class Lecture34 {

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

    public static boolean checkPalindrome(char[] ch, int i, int j){

        // base case
        if(i>j){
            return true;
        }

        if(ch[i] != ch[j]){
            return false;
        }
        else{
            return checkPalindrome(ch, i+1, j-1);
        }

    }

    // more optimise way to find power
    public static int power(int a, int b){

        // base case
        if(b==0){
            return 1;
        }

        if(b==1){
            return a;
        }

        // recursiv call
        int ans = power(a, b/2);

        // if b is even
        if(b%2==0){
            return ans*ans;
        }
        // if b is odd
        else{
            return a * (ans * ans);
        }

    }

    public static void bubbleSort(int[] arr, int n){

        // base case --> already sorted
        if(n==0 || n==1){
            return;
        }

        // largest element ko end me rakh dega
        for(int i = 0;i<n-1;i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }

        bubbleSort(arr, n-1);
    }

    public static void main(String[] args){

        // Question 1 --> reverse the string
        char[] ch = {'c','h','u','r','c','h','i','l'};

        reverse(ch, 0, ch.length-1);

        System.out.println(ch);


        // Question 2 --> check palindrome or not
        char[] ch2 = {'1','a','b','c','b','a','1'};

        boolean ans = checkPalindrome(ch2, 0, ch2.length-1);

        if(ans){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }


        // Question 3 --> power
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans2 = power(a, b);
        System.out.println("Answer is: " + ans2);



        // Question 4 --> bubble sort

        int arr[] = {2,5,1,6,9};
        bubbleSort(arr, arr.length);

        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
