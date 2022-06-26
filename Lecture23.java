import java.util.Scanner;

public class Lecture23 {

    public static boolean isPresent(int[][] arr, int target){

        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++){

                if(arr[i][j] == target){
                    return true;
                }
            }
        }

        return false;
    }

    public static void printRowSum(int[][] arr){

        int sum = 0;
        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++){
                sum = sum + arr[i][j];
            }
            System.out.println("Sum of " + i + "th row is " + sum);
            sum = 0;
        }
    }

    public static void printColSum(int[][] arr){

        int sum = 0;
        for(int i = 0;i<4;i++){
            for(int j = 0;j<3;j++){
                sum = sum + arr[j][i];
            }
            System.out.println("Sum of " + i + "th Coloumn is " + sum);
            sum = 0;
        }
    }

    public static int largestRowSum(int[][] arr){

        int max = Integer.MIN_VALUE;
        int rowIndex = -1;

        int sum = 0;
        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++){
                sum = sum + arr[i][j];
            }

            if(sum > max){
                max = sum;
                rowIndex = i;
            }
            sum = 0;
        }

        System.out.println("Maximum Sum is: " + max);
        return rowIndex;
        
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][4];
        System.out.println("Enter 12 elements in the array");

        // Row wise input -->
        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++){
                
                arr[i][j] = sc.nextInt();
            }
        }



        // Coloumn wise input -->
        // for(int i = 0;i<4;i++){
        //     for(int j = 0;j<3;j++){
        //         arr[j][i] = sc.nextInt();
        //     }
        // }



        // int[][] arr = {
        //                 {1,2,3,4},
        //                 {5,6,7,8},
        //                 {9,10,11,12}
        //             };

        // int[][] arr = {
        //                 {1,11,111,1111},
        //                 {2,22,222,2222},
        //                 {3,33,333,3333},
        //             };
                    

        // Print -->
        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        // System.out.println("Enter an element to search");
        // int target = sc.nextInt();

        // if(isPresent(arr, target)){
        //     System.out.println("Element found");
        // }
        // else{
        //     System.out.println("Not Found");
        // }


        // printRowSum(arr);
        // printColSum(arr);


        int ans = largestRowSum(arr);
        System.out.println("Largest Sum Row is: " + ans);

        sc.close();
    }
    
}
