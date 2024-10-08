class Solution {
    public int minLength(String s) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 1; i < sb.length(); i++) {
            if ((sb.charAt(i-1) == 'A' && sb.charAt(i) == 'B') || 
                (sb.charAt(i-1) == 'C' && sb.charAt(i) == 'D')) {
                
                // Delete the pair
                sb.delete(i-1, i+1);  // Corrected delete to remove two characters
                
                // Reset i to check from the previous character after deletion
                i = Math.max(0, i - 2);  // Use i-2 to check previous combination after removal
            }
        }
        return sb.length();
    }
}
