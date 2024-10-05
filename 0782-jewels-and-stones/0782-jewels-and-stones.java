class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        char[] arr = jewels.toCharArray();
        char[] temp = stones.toCharArray();
        for(int i: arr){
            for(int j:temp){
                if(i == j)
                    count++;
            }
        }
        return count ;
    }
}