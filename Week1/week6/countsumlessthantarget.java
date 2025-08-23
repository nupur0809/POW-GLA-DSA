// Java program to count pairs whose sum is less than
// given target by generating all the pairs
// Time complexity=O(n^2)
public class countsumlessthantarget {

    static int countPairs(int[] arr, int target) {
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] < target)
                    cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 8, 3, 4, 7, 6, 5};
        int target = 7;
        System.out.println(countPairs(arr, target));
    }
}
