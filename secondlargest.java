// Java program to find second largest element in an array
// using Sorting
//O(n*log(n))

import java.util.Arrays;

class hello {
    
    static int getSecondLargest(int[] arr) {
        int n = arr.length;
        

        Arrays.sort(arr);
        
        for (int i = n - 2; i >= 0; i--) {
            
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 35, 1, 10, 34, 1 };
        System.out.println(getSecondLargest(arr));
    }
}