class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        if(nums1.length > nums2.length){
            for(int i = 0; i < nums1.length; i++){
                list.add(nums1[i]);
            }
            for(int i = 0; i < nums2.length; i++){
                if(list.contains(nums2[i])){
                    ans.add(nums2[i]);
                    list.remove((Integer)nums2[i]); // Remove one occurrence
                }
            }
        } else {
            for(int i = 0; i < nums2.length; i++){
                list.add(nums2[i]);
            }
            for(int i = 0; i < nums1.length; i++){
                if(list.contains(nums1[i])){
                    ans.add(nums1[i]);
                    list.remove((Integer)nums1[i]); // Fix: Remove one occurrence
                }
            }
        }

        return ans.stream().mapToInt(i -> i).toArray();
    }
}
