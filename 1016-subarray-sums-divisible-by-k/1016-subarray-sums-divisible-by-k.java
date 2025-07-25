class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int total = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i < nums.length; i++){

            total += nums[i];
            int mod = ((total % k) + k) % k ;
            
            if(map.containsKey(mod))
                count += map.get(mod);

            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }
        return count;
    }
}