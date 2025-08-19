class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int pivot_count = 0;
        int smaller_pivot_count = 0;

        for(int i=0; i < nums.length; i++){
            if(nums[i] == pivot)
                pivot_count++;
            else if(nums[i] < pivot)
                smaller_pivot_count++;
            else
                continue;
        }
        int large_index = smaller_pivot_count + pivot_count ;

        int[] res = new int[nums.length];
        while(pivot_count > 0){
            res[smaller_pivot_count] = pivot;
            smaller_pivot_count++;  
            pivot_count--;
        }

        int smaller_index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < pivot){
                res[smaller_index] = nums[i];
                smaller_index++;
            }
            else if(nums[i] > pivot){
                res[large_index] = nums[i];
                large_index++;
            }
            else
                continue;
        }
        return res;
    }
}