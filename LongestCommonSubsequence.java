public class LongestCommonSubsequence {
    public static int findLCSLength(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) 
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else 
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[m][n]; // Return the length of the LCS
    }

    public static void main(String[] args) {
        String s1 = "ABCBDAB", s2 = "BDCAB";
        System.out.println("Length of LCS: " + findLCSLength(s1, s2)); // Output: 4
    }
}

