class Solution {
    public int minimumMoves(String s) {
        char[] arr = s.toCharArray();
        int n = s.length();
        int total = 0;
        for(int i=0; i<s.length(); i++){
            if(arr[i] == 'X'){
                total++;
                arr[i] = 'O';
                if(i+1 < n) arr[i+1] = 'O';
                if(i+2 < n) arr[i+2] = 'O';
            }
      }
      return total;
    }
}