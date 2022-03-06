import java.util.Scanner;

public class Lecture14 {

    public static int getPivot(int[] arr){
        
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start)/2;

        while(start<end){

            if(arr[mid]>=arr[0]){
                start = mid + 1;
            }
            else{
                end = mid;
            }

            mid = start + (end - start)/2;
        }
        // returning the index of the pivot element
        // we can return start or end because they both will be pointing to the same index element
        return start;
    }

    public static int sqrtInteger(int n){
        
        int start = 0;
        int end = n;
        long mid = start + (end - start)/2;
        
        int ans = -1;
        while(start<=end){
            
            if(mid*mid > n){
                end = (int)mid - 1;
            }
            
            if(mid*mid < n){
                // agar mid*mid kam aarha hai number se to ye possible solution ho skta hai
                // isiliye isko store krlo
                ans = (int)mid;
                start = (int)mid + 1;
            }
            
            if(mid*mid == n){
                return (int)mid;
            }          
            
            mid = start + (end - start)/2;
        }
        return ans;
    }

    public static double morePrecision(int n, int precision, int tempSol){
        
        double factor = 1;
        double ans = tempSol;

        for(int i = 0;i<precision;i++){
            factor = factor/10;
            for(double j = ans; j*j<n; j = j+factor){
                ans = j;
            }
        }

        return ans;
    }

    public static void main(String[] args){
        System.out.println("Lecture 14");

        // int[] arr = {8,10,17,1,3};

        // int ans = getPivot(arr);
        // System.out.println("Pivot in the array is: " + ans);

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int tempSol = sqrtInteger(n);
        System.out.println("Answer is: " + morePrecision(n, 3, tempSol));

        sc.close();
    }
}
