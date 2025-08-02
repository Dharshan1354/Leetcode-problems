class Solution {
    public int numDistinct(String s, String t) {
        int rows = s.length();
        int cols = t.length();
        
        int[][] dp = new int[rows + 1][cols + 1];

        // Base case: An empty target string t is a subsequence of any prefix of s
        for (int row = 0; row <= rows; row++) {
            dp[row][0] = 1;
        }

        // Fill the dp table
        for (int row = 1; row <= rows; row++) {
            for (int col = 1; col <= cols; col++) {
                if (s.charAt(row - 1) == t.charAt(col - 1)) {
                    dp[row][col] = dp[row - 1][col - 1] + dp[row - 1][col];
                } else {
                    dp[row][col] = dp[row - 1][col];
                }
            }
        }

        return dp[rows][cols];
    }
}
