class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int slen = s.length(), plen = p.length();
        if (plen > slen) return list;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Count frequencies for p and first window of s
        for (int i = 0; i < plen; i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(pCount, sCount)) list.add(0);

        // Slide the window
        for (int i = plen; i < slen; i++) {
            sCount[s.charAt(i) - 'a']++; // add new char
            sCount[s.charAt(i - plen) - 'a']--; // remove old char

            if (Arrays.equals(pCount, sCount))
                list.add(i - plen + 1);
        }

        return list;
    }
}
