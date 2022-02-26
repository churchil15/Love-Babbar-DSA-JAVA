public class Lecture13 {

    public static int firstOcc(int[] arr, int key){
       
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start)/2;

        int ans = -1;

        while(start <= end){

            if(arr[mid] == key){
                ans = mid;
                end = mid - 1;
            }
            // Right Part
            else if(key > arr[mid]){
                start = mid + 1;
            }
            // Left Part
            else if(key < arr[mid]){
                end = mid - 1;
            }

            mid = start + (end - start)/2;
        }
        return ans;
    }

    public static int lastOcc(int[] arr, int key){
       
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start)/2;

        int ans = -1;
        while(start <= end){

            if(arr[mid] == key){
                ans = mid;
                start = mid + 1;
            }
            // Right Part
            else if(key > arr[mid]){
                start = mid + 1;
            }
            // Left Part
            else if(key < arr[mid]){
                end = mid - 1;
            }

            mid = start + (end - start)/2;
        }

        return ans;
    }

    public static void main(String[] args){

        int[] even = {1,2,3,3,3,3,3,3,3,3,5};
        
        System.out.println("First Occurence of 3 is at Index: " + firstOcc(even, 3));
        System.out.println("Last Occurence of 3 is at Index: " + lastOcc(even, 3));

        int totalOcc = (lastOcc(even, 3) - firstOcc(even, 3)) + 1;
        System.out.println("Total number of Occurence of 3 is: " + totalOcc);
    }
}
