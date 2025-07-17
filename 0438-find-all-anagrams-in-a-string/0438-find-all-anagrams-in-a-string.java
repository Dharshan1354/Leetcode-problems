class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int plen = p.length();
        int slen = s.length();
        if(plen > slen)
            return list;
        String temp = s.substring(0,plen);
        if(isAnagram(temp,p))
            list.add(0);

        for(int i=1; i<=slen - plen; i++){
            temp = s.substring(i,i+plen);
            if(isAnagram(temp,p))
                list.add(i);
        }
        return list;
    }
    public boolean isAnagram(String s1, String s2){
        int[] count = new int[26];
        for(int i=0; i<s1.length(); i++){
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        for(int i=0; i<26; i++){
            if(count[i] != 0)
                return false;
        }
        return true;
    }
}