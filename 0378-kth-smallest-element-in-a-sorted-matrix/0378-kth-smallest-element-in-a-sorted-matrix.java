class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int len = m * n;
        int[] arr = new int[len];

        int ind = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                arr[ind] = matrix[i][j];
                ind++;
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}
