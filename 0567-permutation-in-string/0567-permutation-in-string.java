class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // Edge case: s1 is longer than s2
        if (s1.length() > s2.length()) return false;

        // Frequency arrays for s1 and the current window in s2
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // Count frequency of each character in s1 and first window in s2
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // Check if the first window is a match
        if (Arrays.equals(s1Count, s2Count)) return true;

        // Slide the window
        for (int i = s1.length(); i < s2.length(); i++) {
            // Add new character to window
            s2Count[s2.charAt(i) - 'a']++;
            // Remove character left out of the window
            s2Count[s2.charAt(i - s1.length()) - 'a']--;

            // Check if current window matches s1's character frequency
            if (Arrays.equals(s1Count, s2Count)) return true;
        }

        // No matching window found
        return false;
    }
}
