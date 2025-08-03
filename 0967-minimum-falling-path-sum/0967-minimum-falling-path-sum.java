class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];

        for(int i = 0; i < m; i++){
            dp[0][i] = matrix[0][i];
        }

        for(int row = 1; row < m; row++){
            for(int col = 0; col < n; col++){
                if(col == 0)
                    dp[row][col] = matrix[row][col] + Math.min(dp[row-1][col], dp[row-1][col+1]);
                else if(col == n-1)
                    dp[row][col] = matrix[row][col] + Math.min(dp[row-1][col-1], dp[row-1][col]);
                else
                   dp[row][col] = matrix[row][col] + Math.min(
                                        Math.min(dp[row - 1][col - 1], dp[row - 1][col]),
                                        dp[row - 1][col + 1]
                                    );
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            min = Math.min(min, dp[m-1][i]);
        }
        return min;
    }
}