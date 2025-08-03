class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int len = triangle.size();
        int[][] dp = new int[len][len];

        for(int i = 0; i < len; i++){
            dp[len-1][i] = triangle.get(len-1).get(i);
        }

        for(int row = len-2; row >= 0; row--){
            for(int col = 0; col <= row; col++){
                dp[row][col] = triangle.get(row).get(col) + 
                                    Math.min(dp[row+1][col], dp[row+1][col+1]);
            }
        }
        return dp[0][0];
    }
}