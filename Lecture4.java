// YT video --> https://www.youtube.com/watch?v=dr-pLeJBr38&list=PLDzeHZWIZsTryvtXdMr6rPh4IDexB5NIA&index=5&t=3107s

import java.util.Scanner;

public class Lecture4 {
    public static void main(String[] args){
        System.out.println("Lecture 4");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n");
        int n = sc.nextInt();

        int row = 1;
        while(row<=n){
            int col = 1;
            while(col<=n){
                System.out.print(col + " ");
                col++;
            }
            System.out.println();
            row++;
        }

        int row1 = 1;
        while(row1<=n){
            int col1 = n;
            while(col1 != 0){
                System.out.print(col1 + " ");
                col1--;
            }
            System.out.println();
            row1++;
        }

        int row2 = 1;
        int count = 1;
        while(row2<=n){
            int col2 = 1;
            while(col2<=n){
                System.out.print(count + " ");
                count++;
                col2++;
            }
            System.out.println();
            row2++;
        }

        int row3 = 1;
        while(row3<=n){
            int col3 = 1;
            while(col3<=row3){
                System.out.print("* ");
                col3++;
            }
            System.out.println();
            row3++;
        }

        int row4 = 1;
        while(row4<=n){
            int col4 = 1;
            while(col4<=row4){
                System.out.print(row4 + " ");
                col4++;
            }
            System.out.println();
            row4++;
        }

        int row5 = 1;
        int count2 = 1;
        while(row5<=n){
            int col5 = 1;
            while(col5<=row5){
                System.out.print(count2 + " ");
                col5++;
                count2++;
            }
            System.out.println();
            row5++;
        }

        int row6 = 1;
        while(row6<=n){
            int col6 = 1;
            int i = 0;
            while(col6<=row6){
                System.out.print((row6 + i) + " ");
                i++;
                col6++;
            }
            System.out.println();
            row6++;
        }

        int row7 = 1;
        while(row7<=n){
            int col7 = row7;
            while(col7<row7*2){
                System.out.print(col7 + " ");
                col7++;
            }
            System.out.println();
            row7++;
        }

        int row8 = 1;
        while(row8<=n){
            int col8 = 1;
            while(col8<=row8){
                System.out.print((row8 - col8 + 1) + " ");
                col8++;
            }
            System.out.println();
            row8++;
        }

        int row9 = 1;
        while(row9<=n){
            int col9 = 1;
            while(col9<=n){
                char ch = (char)('A' + row9 - 1);
                System.out.print(ch + " ");
                col9++;
            }
            System.out.println();
            row9++;
        }

        int row10 = 1;
        while(row10<=n){
            int col10 = 1;
            while(col10<=n){
                char ch = (char)('A' + col10 - 1);
                System.out.print(ch + " ");
                col10++;
            }
            System.out.println();
            row10++;
        }
          
        
        int row11 = 1;
        char ch1 = 'A';
        while(row11<=n){
            int col11 = 1;
            while(col11<=n){
                System.out.print(ch1 + " ");
                ch1++;
                col11++;
            }
            System.out.println();
            row11++;
        }


        int row12 = 1;
        while(row12<=n){
            int col12 = 1;
            while(col12<=n){
                char ch2 = (char)(row12 + col12 + 'A' - 2);
                System.out.print(ch2 + " ");
                col12++;
            }
            System.out.println();
            row12++;
        }

        
        int row13 = 1;
        while(row13<=n){
            int col13 = 1;
            
            while(col13<=row13){
                char ch3 = (char)('A' + row13 - 1);
                System.out.print(ch3 + " ");
                col13++;
            }
            System.out.println();
            row13++;
        }

        int row14 = 1;
        char ch4 = 'A';
        while(row14<=n){
            int col14 = 1;
            while(col14<=row14){
                System.out.print(ch4 + " ");
                col14++;
                ch4++;
            }
            System.out.println();
            row14++;
        }


        int row15 = 1;
        while(row15<=n){
            int col15 = 1;
            while(col15<=row15){
                char ch5 = (char)('A' + row15 + col15 - 2);
                System.out.print(ch5 + " ");
                col15++;
            }
            System.out.println();
            row15++;
        }


        int row16 = 1;
        while(row16<=n){
            char ch6 = (char)('A' + row16 - 1);
            int col16 = 1;            
            while(col16<=row16){
                System.out.print(ch6 + " ");
                ch6++;
                col16++;
            }
            System.out.println();
            row16++;
        }

        

        int row17 = 1;
        while(row17<=n){
            int col17 = 1;
            char ch7 = (char)('A' + n - row17);
            while(col17<=row17){
                System.out.print(ch7 + " ");
                ch7++;
                col17++;
                
            }
            System.out.println();
            row17++;
        }


        int i = 1;
        while(i<=n){
            int space = 1;
            while(space<=n-i){
                System.out.print(" ");
                space++;
            }
            int j = 1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;

        }


        int i1 = 1;
        while(i1<=n){
            int j1 = 1;
            while(j1 <= (n - i1 + 1)){
                System.out.print("*");
                j1++;
            }
            System.out.println();
            i1++;
        }


        int i2 = 1;
        while(i2<=n){

            int j2 = 1;
            int space2 = 1;

            while(space2<i2){
                System.out.print(" ");
                space2++;
            }

            while(j2 <= n-i2+1){
                System.out.print("*");
                j2++;
            }

            System.out.println();
            i2++;            
        }



        int i3 = 1;
        int p = 1;
        while(i3<=n){

            int j3 = 1;
            int space3 = 1;
            

            while(space3<i3){
                System.out.print(" ");
                space3++;
            }

            while(j3 <= n-i3+1){
                System.out.print(p);
                j3++;
            }

            System.out.println();
            i3++;   
            p++;         
        }



        int i4 = 1;
        int num = 1;
        while(i4<=n){
            int space4 = 1;
            while(space4<=n-i4){
                System.out.print(" ");
                space4++;
            }

        
            int j4 = 1;
            while(j4<=i4){
                System.out.print(num);
                j4++;
            }

            System.out.println();
            num++;
            i4++;

        }


        int i5 = 1;
        while(i5<=n){
            
            // Print karo space ko (1st triangle)
            int space5 = 1;
            while(space5 <= n-i5){
                System.out.print(" ");
                space5++;
            }

            // print 2nd triangle
            int j5 = 1;
            while(j5<=i5){
                System.out.print(j5);
                j5++;
            }

            // print 3rd triangle
            j5 = i5 - 1;
            while(j5>=1){
                System.out.print(j5);
                j5--;
            }
            
            System.out.println();
            i5++;
        }


        // Homework Question-->
        
        // int i6 = 1;
        // while(i6 <= n){
        //     // part 1: numbers from 1 to n-i+1
        //     int j6 = 1;
        //     while(j6 <= n-i+1){
        //         System.out.print(" ");
        //         j6++;
        //     } 

        //     // part 2: Starts (i-1)*2 times
        //     j6 = 1;
        //     while(j6<= (i6-1)*2){
        //         System.out.print("*");
        //         j6++;
        //     }

        //     // part 3: numbers from n-i+1 to 1
        //     j6 = n - i6 + 1;
        //     while(j6>=1){
        //         System.out.print(j6);
        //         j6--;
        //     }

        //     System.out.println();
        //     i6++;
        // }


        sc.close();
    }
}
