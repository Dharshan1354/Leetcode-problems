class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapS = new int[256]; // Mapping s -> t
        int[] mapT = new int[256]; // Mapping t -> s

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            if (mapS[chS] != mapT[chT]) return false; // Check consistency
            
            // Store the mapping (index+1 is used to avoid conflicts with default 0)
            mapS[chS] = i + 1;
            mapT[chT] = i + 1;
        }
        return true;
    }
}