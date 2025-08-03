class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int rows = dungeon.length;
        int cols = dungeon[0].length;
        
        int[][] dp = new int[rows][cols];

        // Start from bottom-right corner
        dp[rows - 1][cols - 1] = Math.max(1, 1 - dungeon[rows - 1][cols - 1]);

        // Fill last row
        for (int col = cols - 2; col >= 0; col--) {
            dp[rows - 1][col] = Math.max(1, dp[rows - 1][col + 1] - dungeon[rows - 1][col]);
        }

        // Fill last column
        for (int row = rows - 2; row >= 0; row--) {
            dp[row][cols - 1] = Math.max(1, dp[row + 1][cols - 1] - dungeon[row][cols - 1]);
        }

        // Fill the rest of the grid
        for (int row = rows - 2; row >= 0; row--) {
            for (int col = cols - 2; col >= 0; col--) {
                int minHealthNext = Math.min(dp[row + 1][col], dp[row][col + 1]);
                dp[row][col] = Math.max(1, minHealthNext - dungeon[row][col]);
            }
        }

        return dp[0][0];
    }
}
