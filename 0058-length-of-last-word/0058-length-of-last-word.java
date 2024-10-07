class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int size = s.length()-1;
        while(size >= 0 && s.charAt(size) == ' ')
            size--;
        while(size >= 0 && s.charAt(size) != ' '){
            size--;
            count++;
        }
        return count;
    }
}