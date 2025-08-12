import java.util.Arrays;

class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int result = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int count = 1;
            int lastPos = stalls[0];

            for (int i = 1; i < stalls.length; i++) {
                if (stalls[i] - lastPos >= mid) {
                    count++;
                    lastPos = stalls[i];
                }
            }

            if (count >= k) { 
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}