// https://www.youtube.com/watch?v=nMGL2vlyJk0 - youtube link

class Solution {
    public int singleNonDuplicate(int[] nums) {
       int len = nums.length;
       int low = 0;
       int high = len-1;

        if(len == 1)
            return nums[0];
        if(nums[high] != nums[high-1])
            return nums[high];
        if(nums[low] != nums[low+1])
            return nums[low];
        
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1])
                return nums[mid];
            else if(mid%2 == 0 && nums[mid] == nums[mid+1] || mid%2 == 1 && nums[mid] == nums[mid-1])
                low = mid + 1;
            else
                high = mid - 1;
        }
    return -1;
    }
}