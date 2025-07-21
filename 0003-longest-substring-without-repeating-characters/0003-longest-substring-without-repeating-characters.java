class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int temp = 0;
        HashSet <Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                temp++;
            }
            else{
                max = Math.max(max, temp);
                set.clear();
                set.add(ch);
                temp = 1;
            }
        }
        return max;
    }
}