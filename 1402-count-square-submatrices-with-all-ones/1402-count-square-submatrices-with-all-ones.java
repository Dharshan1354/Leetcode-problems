class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];

        for(int row = 0; row < m; row++){
           dp[row][0] = matrix[row][0];
        }
        for(int col = 0; col < n; col++){
            dp[0][col] = matrix[0][col];
        }

        for(int row = 1; row < m; row++){
            for(int col = 1; col < n; col++){
                if(matrix[row][col] == 1){
                    dp[row][col] = Math.min(dp[row-1][col], Math.min(dp[row-1][col-1], 
                                                                    dp[row][col-1])) + 1;
                }
                else
                    dp[row][col] = 0;
            }
        }
        int count = 0;
        for(int row = 0; row < m; row++){
            for(int col = 0; col < n; col++){
                count += dp[row][col];
            }
        }
    return count;
    }
}