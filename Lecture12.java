public class Lecture12 {

    public static int binarySearch(int[] arr, int key){

        int start = 0;
        int end = arr.length-1;

        int mid = start + (end - start)/2;

        while(start <= end){

            if(arr[mid] == key){
                return mid;
            }

            // Right part
            if(key > arr[mid]){
                start = mid + 1;
            }
            // Left Part
            else{
                end = mid - 1;
            }

            mid = start + (end - start)/2;
        }

        return -1;
    }

    public static void main(String[] args){

        int[] even = {2,4,6,8,12,18};
        int[] odd = {3,8,11,14,16};

        int evenArrayIndex = binarySearch(even, 6);
        System.out.println("Index of 6 is " + evenArrayIndex);

        int oddArrayIndex = binarySearch(odd, 14);
        System.out.println("Index of 14 is " + oddArrayIndex);

    }
}
