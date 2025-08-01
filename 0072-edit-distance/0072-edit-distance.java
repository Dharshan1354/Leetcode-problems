//https://www.youtube.com/watch?v=HwDXH35lr0o&list=PLFdAYMIVJQHPXtFM_9mpwwQtIdzP6kxHS&index=12&t=16s


class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];

        for(int i = 1; i <= m; i++)    dp[i][0] = i;
        for(int j = 1; j <= n; j++)    dp[0][j] = j;

        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(word1.charAt(i-1) == word2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else{
                    int left = dp[i-1][j];
                    int top = dp[i][j-1];
                    int topleft = dp[i-1][j-1];
                    dp[i][j] = Math.min(topleft, Math.min(top,left)) + 1;
                }
            }
        }
        return dp[m][n];
    }
}