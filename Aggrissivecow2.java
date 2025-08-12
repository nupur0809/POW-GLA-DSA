import java.util.Arrays;

class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);

        int maxDist = stalls[stalls.length - 1] - stalls[0];

        for (int dist = maxDist; dist >= 1; dist--) {
            if (canPlace(stalls, k, dist)) {
                return dist;
            }
        }
        return 0;
    }

    private boolean canPlace(int[] stalls, int k, int minDist) {
        int count = 1; // First cow
        int lastPos = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= minDist) {
                count++;
                lastPos = stalls[i];
                if (count >= k) return true;
            }
        }
        return false;
    }
}
