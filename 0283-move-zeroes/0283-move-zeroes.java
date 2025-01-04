class Solution {
    public void moveZeroes(int[] arr) {
        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }
        int count = arr.length - j;
        while(count > 0){
            arr[j] = 0;
            j++;
            count--;
        }
    }
}