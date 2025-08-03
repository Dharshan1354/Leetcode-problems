class Solution {
    public int countSquares(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] dp = new int[rows][cols];
        int totalSquares = 0;

        // Initialize first row and column
        for (int row = 0; row < rows; row++) {
            dp[row][0] = matrix[row][0];
            totalSquares += dp[row][0];
        }

        for (int col = 1; col < cols; col++) {
            dp[0][col] = matrix[0][col];
            totalSquares += dp[0][col];
        }

        // Fill the DP table
        for (int row = 1; row < rows; row++) {
            for (int col = 1; col < cols; col++) {
                if (matrix[row][col] == 1) {
                    dp[row][col] = Math.min(
                        Math.min(dp[row - 1][col], dp[row][col - 1]),
                        dp[row - 1][col - 1]
                    ) + 1;
                } else {
                    dp[row][col] = 0;
                }
                totalSquares += dp[row][col];
            }
        }

        return totalSquares;
    }
}
