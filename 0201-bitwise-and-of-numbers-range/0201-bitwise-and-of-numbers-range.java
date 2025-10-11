class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int shift = 0;

        // Find the common prefix
        while (left < right) {
            left >>= 1;   // shift right
            right >>= 1;  // shift right
            shift++;      // count how many shifts we did
        }

        // Shift the common prefix back to its position
        return left << shift;
    }
}
