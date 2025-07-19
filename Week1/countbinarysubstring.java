public class countbinarysubstring {

    public static int countBinarySubstrings(String s) {
        int prev = 0;
        int curr = 1;
        int res = 0;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else {
                res += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
        }

        res += Math.min(prev, curr);
        return res;
    }

    public static void main(String[] args) {
        String s = "00110011";
        int result = countBinarySubstrings(s);
        System.out.println("Count of binary substrings: " + result);
    }
}
//optimal solution with time complexity o(n)