class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int start = 0;
        int end = s.length()-1;
        while(start <= end){
            char fc = s.charAt(start);
            char lc = s.charAt(end);
            if(fc != lc){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}