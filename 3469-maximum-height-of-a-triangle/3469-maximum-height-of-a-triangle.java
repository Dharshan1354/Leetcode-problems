class Solution {
    public int maxHeightOfTriangle(int red, int blue) {
        int one = find(red,blue);
        int second = find(blue,red);
        return Math.max(one,second);
    }
    public int find(int max,int min){
        int temp = 1;
        int count = 0;
        while(max > 0 || min > 0){
            if(count % 2 == 0){
                if(max >= temp)
                    max = max - temp;
                else
                    break;
            }
            else{
                if(min >= temp)
                    min = min - temp;
                else
                    break;
            }
            count++;
            temp++;
        }
        return count;
    }
}