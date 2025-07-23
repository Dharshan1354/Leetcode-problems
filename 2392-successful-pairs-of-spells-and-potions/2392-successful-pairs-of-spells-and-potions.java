import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);  // Sort potions for binary search
        int[] res = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            int spell = spells[i];
            int left = 0, right = potions.length - 1;
            int index = potions.length;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                long product = (long) spell * potions[mid];

                if (product >= success) {
                    index = mid;      // Possible candidate, try to find earlier
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            res[i] = potions.length - index;  // Count of valid potions
        }

        return res;
    }
}
