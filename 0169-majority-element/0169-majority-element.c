int majorityElement(int* nums, int numsSize) {
    int voter=nums[0];
    int votercount=1;
    for(int ind=1;ind<numsSize;ind++){
        if(voter==nums[ind]){
            votercount+=1;
            voter=nums[ind];
        }
        else{
            votercount-=1;
            if(votercount<=0){
                votercount=1;
                voter=nums[ind];
            }
        }
    }
    return voter;
}