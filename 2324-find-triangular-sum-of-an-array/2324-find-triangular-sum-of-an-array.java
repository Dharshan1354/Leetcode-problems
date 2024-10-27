class Solution {
    public int triangularSum(int[] arr) {
        int n=arr.length;
        int sum=0;
        
        for(int i=n;i>0;i--){
            for(int j=0;j<i-1;j++){
                arr[j]=(arr[j]+arr[j+1])%10;
            }
        }
        return arr[0];
    }
}