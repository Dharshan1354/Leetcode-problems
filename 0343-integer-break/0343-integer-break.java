class Solution {
    public int integerBreak(int n) {
        int[] arr = new int[n + 1];

        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = 1;
            
            for (int j = 1; j < i; j++) {
                arr[i] = Math.max(arr[i], Math.max(arr[j], j) * (i - j));
            }
        }

        return arr[n];
    }
}